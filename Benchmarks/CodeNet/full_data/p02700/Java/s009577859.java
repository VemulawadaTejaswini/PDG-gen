import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int aoki = a/d + (a%d==0 ? 0 : 1);
        int takahashi = c/b + (c%b==0 ? 0 : 1);
        if(aoki >= takahashi){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}