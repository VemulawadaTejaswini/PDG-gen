import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=Long.parseLong(sc.next());
        long b=Long.parseLong(sc.next());
        long min=Math.min(a,b);
        long max=Math.max(a,b);
        int res=1;
        long border=(long) Math.sqrt(min);
        for(long i=2;i<=border;i++){
            if(min%i==0){
                if(max%i==0){
                    res++;
                    max/=i;
                    while(max%i==0){
                        max/=i;
                    }
                }
                while(min%i==0){
                    min/=i;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}