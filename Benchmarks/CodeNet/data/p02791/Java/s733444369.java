import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        int a = n;
        boolean b = true;
        for(int i = 0; i < n; i++){
            p[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            b = true;
            for(int j = 0; j <= i; j++){
                if(p[i] > p[j] && b){
                    a--;
                    b = false;
                }
            }
        }
        System.out.println(a);
    }
}