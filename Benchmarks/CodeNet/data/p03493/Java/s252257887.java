import java.util.Scanner;

public class Main {

      public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        if(String.valueOf(num).length() == 3) {
          String str = Integer.toString(num); 
          
          int count = 0;
          char[] c = str.toCharArray();
          
          for(char c1 : c) {
            if(c1 == '1') {
            	count++;
            }
        }
          
          System.out.println(count);
          
        }
      }
}