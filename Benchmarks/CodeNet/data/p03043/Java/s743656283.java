import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double ans=0;
        double n2=1;
        double count=1;
        while(n*n2<m){
            n2*=2;
            count/=2;
        }
        ans+=count;
        for(int i=n-1;i>0;i--){
            while((n2)*i<m){count/=2;
                n2*=2;
            }
            ans+=count;
        }
        System.out.println(ans/n);
    }
}
