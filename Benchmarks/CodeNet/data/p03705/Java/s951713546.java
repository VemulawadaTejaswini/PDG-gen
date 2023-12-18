import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int min = a*(N-1)+b;
        int max = a+b*(N-1);
        if(a>b || (N==1 && a<b)) System.out.println(0);
        else System.out.println(max-min+1);
    }
}