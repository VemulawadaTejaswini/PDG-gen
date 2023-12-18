import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 1; i < n; i++){
            a += i;
        }
        for(int i = 1; i < m; i++){
            b += i;
        }
        System.out.println(a + b);
    }
}