import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();       
        
        int res = 0;
        res = res + Math.min(A,B);
        res = res + Math.min(C,D);
        System.out.println(res);
    }
}