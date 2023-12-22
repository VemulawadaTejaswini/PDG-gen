import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String s = scan.next();

      int count = 0;
      if(s.charAt(1) == 'S'){
        if(s.charAt(0) == 'R' || s.charAt(2) == 'R')
            count = 1;
        else
            count = 0;
      }else{
          if(s.charAt(0) == 'R'){
            if(s.charAt(2) == 'R'){
                count = 3;
            }else{
                count = 2;
            }
          }else if(s.charAt(2) == 'R'){
            if(s.charAt(0) == 'R'){
                count = 3;
            }else{
                count = 2;
            }
          }else
            count = 1;
        }
        System.out.println(count);
    }
}