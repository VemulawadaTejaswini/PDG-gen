import java.util.*;
public class Main {
   static final int SIZE = 6; //the number of sides
   public static void main(String[] args) {
      //variables
      Scanner sc = new Scanner(System.in);
      String[] input = sc.nextLine().split(" ");
      int[] sides = new int[SIZE];
      for(int i = 0; i < SIZE; i ++){
         sides[i] = Integer.parseInt(input[i]);
      }
      
      Dice d = new Dice(sides);
      
      String command = sc.nextLine();
      for(int i = 0; i < command.length(); i ++){
         switch (command.charAt(i)){
            case 'N':
               d.toNorth();
               break;
            case 'E':
               d.toEast();
               break;
            case 'W':
               d.toWest();
               break;
            case 'S':
               d.toSouth();
               break;
         }
      }//
      
      sides = d.getSides();
      System.out.println(sides[0]);
      
      
   
   
   }//close main method


   /**
   * Dice class
   *
   */
   public static class Dice {
      //instaice variables
      private int[] sides = new int[SIZE];
      
      /**
      *constructor
      *@param sides : the array of numbers indicating each side
      *
      */
      public Dice(int[] sides){
         for(int i = 0; i < SIZE; i ++){
            this.sides[i] = sides[i];
         }
      }
      
      /**
      *toNorth method
      */
      public void toNorth(){
         int temp = sides[0];
         sides[0] = sides[1];
         sides[1] = sides[5];
         sides[5] = sides[4];
         sides[4] = temp;
      }
      
      /**
      *toSouth method
      */
      public void toSouth(){
         int temp = sides[0];
         sides[0] = sides[4];
         sides[4] = sides[5];
         sides[5] = sides[1];
         sides[1] = temp;
      }
      
      /**
      *toWest method
      */
      public void toWest(){
         int temp = sides[0];
         sides[0] = sides[2];
         sides[2] = sides[5];
         sides[5] = sides[3];
         sides[3] = temp;
      }
      
      /**
      *toEast method
      *
      */
      public void toEast(){
         int temp = sides[0];
         sides[0] = sides[3];
         sides[3] = sides[5];
         sides[5] = sides[2];
         sides[2] = temp;
      }
      
      /**
      *getSides method
      *@return the int[] indicating the sides
      */
      public int[] getSides(){
         return sides;
      }
      
   }
}//close class
