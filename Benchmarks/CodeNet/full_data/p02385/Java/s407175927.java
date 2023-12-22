// ITP1_11_C Dice 3
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Dice d1;
      Dice d2;

      try {
         String[][] input = new String[2][];
         for (int i = 0; i < 2; i++)
            input[i] = br.readLine().split(" ");
         int[][] roll = new int[2][6];
         for (int i = 0; i < roll.length; i++)
            for (int j = 0; j < input[i].length; j++)
               roll[i][j] = Integer.parseInt(input[i][j]);
         d1 = new Dice(roll[0][0], roll[0][1], roll[0][2], roll[0][3], roll[0][4], roll[0][5]);
         d2 = new Dice(roll[1][0], roll[1][1], roll[1][2], roll[1][3], roll[1][4], roll[1][5]);
         boolean flag = compare(d1, d2);
         System.out.println(flag ? "Yes" : "No");
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static boolean compare(Dice d1, Dice d2) {
      if (check(d1, d2)) return true;
      else {
         for (int i = 0; i < 6; i++) { 
            rotate(d2, i);
            if (check(d1, d2) && i < 6) return true;
         }
      }
      return false;
   }
   static boolean check(Dice d1, Dice d2) {
      if (d1.Top == d2.Top && d1.Front == d2.Front && d1.Right == d2.Right && d1.Left == d2.Left && d1.Back == d2.Back && d1.Bottom == d2.Bottom) {
         return true;
      }
      return false;
   }
   static void rotate(Dice d, int cnt) {
      if (cnt == 0) { 
         Dice tmp = new Dice(d.Top, d.Front, d.Right, d.Left, d.Back, d.Bottom);
         d.north();
      }
      if (cnt == 1) { 
         Dice tmp = new Dice(d.Top, d.Front, d.Right, d.Left, d.Back, d.Bottom);
         d.north();
         d.north();
      }
      if (cnt == 2) { 
         Dice tmp = new Dice(d.Top, d.Front, d.Right, d.Left, d.Back, d.Bottom);
         d.east();
      }
      if (cnt == 3) { 
         Dice tmp = new Dice(d.Top, d.Front, d.Right, d.Left, d.Back, d.Bottom);
         d.east();
         d.east();
      }
      if (cnt == 4) { 
         Dice tmp = new Dice(d.Top, d.Front, d.Right, d.Left, d.Back, d.Bottom);
         d.west();
      }
      if (cnt == 5) { 
         Dice tmp = new Dice(d.Top, d.Front, d.Right, d.Left, d.Back, d.Bottom);
         d.south();
      }
   }
}

class Dice {
   int Top;
   int Front; 
   int Right;
   int Left;
   int Back;
   int Bottom;
   int work;

   Dice(int top, int front, int right, int left, int back, int bottom) {
      Top    = top;
      Left   = left;
      Back   = back;
      Front  = front;
      Right  = right;
      Bottom = bottom;
   }
   void north() {
      work   = Top;
      Top    = Front;
      Front  = Bottom;
      Bottom = Back;
      Back   = work;
   }
   void east() {
      work   = Top;
      Top    = Left;
      Left   = Bottom;
      Bottom = Right;
      Right  = work;
   }
   void west() {
      work   = Top;
      Top    = Right;
      Right  = Bottom;
      Bottom = Left;
      Left   = work;
   }
   void south() {
      work   = Top;
      Top    = Back;
      Back   = Bottom;
      Bottom = Front;
      Front  = work;
   }
}