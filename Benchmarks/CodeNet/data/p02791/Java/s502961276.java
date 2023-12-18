import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        int min = Integer.MAX_VALUE;
        int a = 0;
        for(int i = 0; i < n; i++){
            p[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(p[i] <= min){
                a++;
            }
            if(i != n - 1){
                min = Math.min(p[i], p[i + 1]);
            }
        }
        System.out.println(a);
    }
}