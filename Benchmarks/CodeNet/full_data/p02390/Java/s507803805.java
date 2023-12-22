import java.util.*;
public class Main {
   public static void main(String args[]){
      //declaration and initialization
      Scanner sc = new Scanner(System.in);
      String input[];
      
      //reading the intput
      input = sc.nextLine().split(" ",0);
      
      //variables for each problem
      int time;
      int hour;
      int min;
      int sec;
      
      //assginment
      time = Integer.parseInt(input[0]);
            
      //calculation
      
      hour = time/3600;
      time -= hour * 3600;
      
      min = time/60;
      sec = time%60;
                  
     //output
      System.out.println(hour + ":" + min + ":" + sec);
      
      
      
   }//main
      
}//class