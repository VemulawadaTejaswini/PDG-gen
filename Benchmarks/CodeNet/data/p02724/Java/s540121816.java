import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        
        long ans=0L;
        
        ans+=((N/500)*1000);
        N-=(ans/2);
        ans+=((N/5)*5);
        
        System.out.println(ans);

    }
}
