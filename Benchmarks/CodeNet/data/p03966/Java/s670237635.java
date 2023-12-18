import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int po=Math.max((int)Math.ceil((double)a/x),(int)Math.ceil((double)b/y));
            a=x*po;
            b=y*po;
        }
        System.out.println(a+b);
        
    }
}