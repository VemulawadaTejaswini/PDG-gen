import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int s = 0;
        
        int a = sc.nextInt();
        
        while(a>=3600){
            a -= 3600;
            h++;
        }
        
        while(a>=60){
            a -= 60;
            m++;
        }
        
        s = a;
        
        
        System.out.println(h+":"+m+":"+s);
    }
}

