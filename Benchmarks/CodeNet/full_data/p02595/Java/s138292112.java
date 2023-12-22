import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[])throws Exception{
    Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        while(N-->0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double dis = Math.sqrt((X*X)+ (Y*Y));
            if(dis<=D) count++;
        }
        System.out.println(count);
    }
}