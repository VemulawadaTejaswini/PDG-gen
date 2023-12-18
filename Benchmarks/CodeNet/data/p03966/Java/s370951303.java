import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a=1,b=1;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            long m=Math.max((long)Math.ceil((double)a/x),(long)Math.ceil((double)b/y));
            a=x*m;
            b=y*m;
        }
        System.out.println(a+b);
    }
}
