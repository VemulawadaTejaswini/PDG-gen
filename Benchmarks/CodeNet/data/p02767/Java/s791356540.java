import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int a = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
        }
        System.out.println();
        for(int p = 1; p <= 100; p++){
            a = 0;
            for(int i = 0; i < n; i++){
                a += Math.pow(x[i] - p, 2);
            }
            if(a < min){
                min = a;
            }
        }
        System.out.println(min);
    }
}