import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            int ma=-1;
            int mi=1001;
            int sum=0;
            for(int i=0;i<n;i++){
                int s=sc.nextInt();
                if(s>ma) ma=s;
                if(s<mi) mi=s;
                sum+=s;
            }
            sum-=ma+mi;
            System.out.println(sum/(n-2));
        }
    }
}
