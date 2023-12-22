// ITP1_11_C Dice 3
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Dice dice1;
      Dice dice2;

      try {
         String[][] input = new String[2][];
         for (int i = 0; i < 2; i++)
            input[i] = br.readLine().split(" ");
         int[][] roll = new int[2][6];
         for (int i = 0; i < roll.length; i++)
            for (int j = 0; j < input[i].length; j++)
               roll[i][j] = Integer.parseInt(input[i][j]);
         dice1 = new Dice(roll[0][0], roll[0][1], roll[0][2], roll[0][3], roll[0][4], roll[0][5]);
         dice2 = new Dice(roll[1][0], roll[1][1], roll[1][2], roll[1][3], roll[1][4], roll[1][5]);
         boolean flag = compare(dice1, dice2);

         System.out.println(flag ? "Yes" : "No");
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   static boolean compare(Dice dice1, Dice dice2) {
      if (dice2.Top == dice1.Top && dice2.Front == dice1.Front && dice2.Right == dice1.Right && dice2.Left == dice1.Left && dice2.Back == dice1.Back && dice2.Bottom == dice1.Bottom) return true;
      else  { 
         if (dice1.Top == dice2.Front || dice1.Top == dice2.Right || dice1.Top == dice2.Left || dice1.Top == dice2.Back || dice1.Top == dice2.Bottom) {
            if (dice1.Top == dice2.Front || dice1.Top == dice2.Back || dice1.Top == dice2.Bottom) {
               for (int i = 0; i < 4; i++) {
                  dice2.north();
                  if (dice1.Top == dice2.Top) break;
               }
               if (compare(dice1, dice2)) return true;
               else if (dice1.Front == dice2.Right || dice1.Front == dice2.Back || dice1.Front == dice2.Left) { 
                  for (int i = 0; i < 4; i++) {
                     dice2.north();
                     dice2.east();
                     dice2.south();
                     if (dice1.Front == dice2.Front) break;
                  }
                  if (compare(dice1, dice2)) return true;
               }
            }
            else if (dice1.Top == dice2.Right || dice1.Top == dice2.Left) {
               for (int i = 0; i < 4; i++) { 
                  dice2.east();
                  if (dice1.Top == dice2.Top) break;
               }
               if (compare(dice1, dice2)) return true;
               else if (dice1.Front == dice2.Right || dice1.Front == dice2.Back || dice1.Front == dice2.Left) { 
                  for (int i = 0; i < 4; i++) {
                     dice2.north();
                     dice2.east();
                     dice2.south();
                     if (dice1.Front == dice2.Front) break;
                  }
                  if (compare(dice1, dice2)) return true;
               }
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
   public void north() {
      work   = Top;
      Top    = Front;
      Front  = Bottom;
      Bottom = Back;
      Back   = work;
   }
   public void east() {
      work   = Top;
      Top    = Left;
      Left   = Bottom;
      Bottom = Right;
      Right  = work;
   }
   public void west() {
      work   = Top;
      Top    = Right;
      Right  = Bottom;
      Bottom = Left;
      Left   = work;
   }
   public void south() {
      work   = Top;
      Top    = Back;
      Back   = Bottom;
      Bottom = Front;
      Front  = work;
   }
}