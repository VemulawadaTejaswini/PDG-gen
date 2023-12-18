import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int r = 0;
        for(int t=A; t<=T; t+=A) {
            r+=B;
        }
        System.out.println(r);
   }
}