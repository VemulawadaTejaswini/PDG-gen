import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int[] c = new int[n];
        int a = 0;
        for(int i = 1; i < n + 1; i++){
            c[i - 1] = l + i - 1;
            a += c[i - 1];
        }
        int min = c[0];
        for(int i = 0; i < n; i++){
            if(Math.abs(c[i]) < Math.abs(c[0])){
                min = c[i];
            }
        }
        System.out.println(a - min);
    }
}