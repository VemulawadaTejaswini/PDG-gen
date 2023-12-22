// ITP1_11_D Dice 4
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         int n = Integer.parseInt(br.readLine());
         Dice[] d = new Dice[n];
         String[][] input = new String[n][];
         for (int i = 0; i < n; i++) {
            input[i] = br.readLine().split(" ");
         }
         int[][] roll = new int[n][6];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
               roll[i][j] = Integer.parseInt(input[i][j]);
            }
         }
         for (int i = 0; i < n; i++) {
            d[i] = new Dice(roll[i][0], roll[i][1], roll[i][2], roll[i][3], roll[i][4], roll[i][5]);
         }
         boolean isSame = false;
         for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++)
            isSame = compare(d[i], d[j]);
            if (isSame) break;
         }
         System.out.print(isSame ? "No" : "Yes");
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static boolean compare(Dice d1, Dice d2) {
      if (check(d1, d2)) return true;
      else {
         if (rotate(d1, d2)) return true;
      }
      return false;
   }
   static boolean check(Dice d1, Dice d2) {
      if (d1.Top == d2.Top && d1.Front == d2.Front && d1.Right == d2.Right && d1.Left == d2.Left && d1.Back == d2.Back && d1.Bottom == d2.Bottom) {
         return true;
      }
      return false;
   }
   static boolean rotate(Dice d1, Dice d2) {
      for (int i = 0; i <= 6; i++) {
         if (i == 0) {
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
         if (i == 1) {
            d2.north();
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
         if (i == 2) {
            d2.north();
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
         if (i == 3) {
            d2.north();
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
         if (i == 4) {
            d2.north();
            d2.east();
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
         if (i == 5) {
            d2.east();
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
         if (i == 6) {
            d2.east();
            for (int j = 0; j < 4; j++) {
               if (check(d1, d2)) return true;
               d2.spin();
            }
         }
      }
      return false;
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
   void spin() {
      work  = Front;
      Front = Right;
      Right = Back;
      Back  = Left;
      Left  = work;
   }
}