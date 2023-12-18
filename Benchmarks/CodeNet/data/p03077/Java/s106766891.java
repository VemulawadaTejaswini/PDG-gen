import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
        long num[]=new long[5];
        
        for(int i=0;i<5;i++)num[i]=sc.nextInt();
        long min=num[0];
        for(int i=0;i<4;i++)min=Math.min(min,num[i+1]);
        long count=0;
        if(n%min==0)count=n/min+4;
        else count=n/min+5;
        System.out.println(count);
    }
}
