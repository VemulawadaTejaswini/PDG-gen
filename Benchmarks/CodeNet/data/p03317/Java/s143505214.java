import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int n = 0;
        int a = (N-K)/(K-1);
        if ((N-K)%(K-1) == 0) {
            n = 1 + a;
        }else{
            n = 2 + a;
        }
        System.out.println(n);
    }
}