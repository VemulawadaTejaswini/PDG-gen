import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int l[]=new int[n];
        int d[]=new int[n+1];
        d[0]=0;
        int ans=1;
        for(int i=0; i<n; i++){
            l[i]=sc.nextInt();
            d[i+1]=d[i]+l[i];
            if(d[i+1]<=x)
                ans++;
        }
        System.out.println(ans);
    }
}
