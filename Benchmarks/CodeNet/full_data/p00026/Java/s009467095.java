import java.util.Scanner;
public class Main {
   public static final int MAPSIZE = 10;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      /*we prepare bigger field*/
      int[][] field = new int[MAPSIZE + 4][MAPSIZE + 4];
      
      while(sc.hasNext()) {
         /*get coordinates and magnitude of the ink*/
         String[] input = sc.nextLine().split(",");      
         
         /*if null input, break the loop*/
         if(input.length == 1) {
            break;
         }         
         
         /*parse the input data to integer*/
         int x = Integer.parseInt(input[0]);
         int y = Integer.parseInt(input[1]);
         int size = Integer.parseInt(input[2]);
         
         /*drop the ink*/
         drop(field, x, y, size);         
      }// end of while loop
      
      /*only go through valid part of the field and count value with 0*/
      int count = 0;
      int max = 0;
      for(int i = 2; i <= MAPSIZE + 1; i ++) {
         for(int j = 2; j <= MAPSIZE + 1; j ++) {
            if(field[i][j] == 0) {
               count ++;
            } else if(field[i][j] > max) {
               max = field[i][j];
            }
         }
      }
      
      /*print out the reuslt*/
      System.out.println(count);
      System.out.println(max);
   }// end of main method
   
   
   public static void drop(int[][] field, int x, int y, int size) {
      switch(size) {
         case 1:
            dropMin(field, y, x); //because the array is configured differently, x and y are switched.
            break;
         case 2:
            dropMiddle(field, y, x);
            break;
         case 3:
            dropMax(field, y, x);
            break;
      }
   }
   
   
   public static void dropMin(int[][] field, int x, int y) {
         field[x + 2][y + 2] ++; //center
         field[x + 2][y + 1] ++; //up
         field[x + 2][y + 3] ++; //down
         field[x + 1][y + 2] ++; //left
         field[x + 3][y + 2] ++; //right
   }
   
   public static void dropMiddle(int[][] field, int x, int y) {
      dropMin(field, x, y);
      field[x + 3][y + 3] ++;
      field[x + 3][y + 1] ++;
      field[x + 1][y + 1] ++;
      field[x + 1][y + 3] ++;
   }
   
   public static void dropMax(int[][] field, int x, int y) {
      dropMiddle(field, x, y);
      field[x + 2][y] ++;
      field[x + 2][y + 4] ++;
      field[x][y + 2] ++;
      field[x + 4][y + 2] ++;
   }

}// end of class
