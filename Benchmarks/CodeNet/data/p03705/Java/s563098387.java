import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        
        long min = a*(N-1)+b;
        long max = a+b*(N-1);
        if(a>b || (N==1 && a<b)) System.out.println(0);
        else System.out.println(max-min+1);
    }
}