import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = 1;
        if (n==1){
            System.out.println(p);
        }else {
            for (long i=1;i<=Math.pow(p,1d/n);i++){
                if (p%(long)Math.pow(i,n)==0)ans=i;
            }
            System.out.println(ans);
        }

    }
}
