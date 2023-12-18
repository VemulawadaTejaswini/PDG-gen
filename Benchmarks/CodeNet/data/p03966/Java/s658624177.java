import java.util.*;

public class Main {
    public static long di(long a,long b){
        return(a+b-1)/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a=1,b=1;
        for(int i=0;i<n;i++){
            long x=Long.parseLong(sc.next());
            long y=Long.parseLong(sc.next());
            long m=Math.max(di(a,x),di(b,y));
            a=x*m;
            b=y*m;
        }
        System.out.println(a+b);
    }
}
