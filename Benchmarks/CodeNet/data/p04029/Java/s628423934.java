import java.util.*;

public class Main{
    
    /////////////////////////////////
    //                             //
    //  @ Author: Ali Mohammed Ali //
    //                             //
    /////////////////////////////////
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num;
        int sum = 0;
        
        num = in.nextInt();
        
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println(sum);
        
    } // End of Main method
    
  } // End of class