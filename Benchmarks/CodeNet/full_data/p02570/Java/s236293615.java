import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        float t =(float) scanner.nextInt();
        int s = scanner.nextInt();
        
        float res = (float)d/s;
        if(res>t)
        System.out.println("No");
        else
        System.out.println("Yes");
        
        
     }
}
