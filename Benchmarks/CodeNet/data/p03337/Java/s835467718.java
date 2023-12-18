import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a + b;
        int m = a - b;
        int k = a * b;
        if(p < m){
            p = m;
        }
        if(p < k){
            p = k;
        }
        System.out.println(p);
        sc.close();
    }
}