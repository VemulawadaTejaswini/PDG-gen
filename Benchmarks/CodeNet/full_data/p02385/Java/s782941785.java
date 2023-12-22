// ITP1_11_C Dice 3
import java.io.*;

public class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Dice[] dice = new Dice[2];

      try {
         String[][] input = new String[2][];
         for (int i = 0; i < 2; i++)
            input[i] = br.readLine().split(" ");
         int[][] roll = new int[2][6];
         for (int i = 0; i < roll.length; i++)
            for (int j = 0; j < input[i].length; j++)
               roll[i][j] = Integer.parseInt(input[i][j]);
         dice[0] = new Dice(roll[0][0], roll[0][1], roll[0][2], roll[0][3], roll[0][4], roll[0][5]);
         dice[1] = new Dice(roll[1][0], roll[1][1], roll[1][2], roll[1][3], roll[1][4], roll[1][5]);

         if ((dice[1].FRONT == dice[0].FRONT) && (dice[1].BACK == dice[0].BACK))
            while (dice[1].TOP != dice[0].TOP)
               dice[1].east();
         if ((dice[1].RIGHT == dice[0].RIGHT) && (dice[1].LEFT == dice[1].LEFT))
            while (dice[1].TOP != dice[0].TOP)
               dice[1].north();

         if ((dice[0].TOP    == dice[1].TOP)
          && (dice[0].FRONT  == dice[1].FRONT)
          && (dice[0].RIGHT  == dice[1].RIGHT)
          && (dice[0].LEFT   == dice[1].LEFT)
          && (dice[0].BACK   == dice[1].BACK)
          && (dice[0].BOTTOM == dice[1].BOTTOM))
            System.out.println("Yes");
         else
            System.out.println("No");
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
}

class Dice {
   int TOP;
   int FRONT; 
   int RIGHT;
   int LEFT;
   int BACK;
   int BOTTOM;
   int work;

   Dice(int top, int front, int right, int left, int back, int bottom) {
      TOP    = top;
      LEFT   = left;
      BACK   = back;
      FRONT  = front;
      RIGHT  = right;
      BOTTOM = bottom;
   }

   public void north() {
      work   = TOP;
      TOP    = FRONT;
      FRONT  = BOTTOM;
      BOTTOM = BACK;
      BACK   = work;
   }
   public void east() {
      work   = TOP;
      TOP    = LEFT;
      LEFT   = BOTTOM;
      BOTTOM = RIGHT;
      RIGHT  = work;
   }
   public void west() {
      work   = TOP;
      TOP    = RIGHT;
      RIGHT  = BOTTOM;
      BOTTOM = LEFT;
      LEFT   = work;
   }
   public void south() {
      work   = TOP;
      TOP    = BACK;
      BACK   = BOTTOM;
      BOTTOM = FRONT;
      FRONT  = work;
   }
}