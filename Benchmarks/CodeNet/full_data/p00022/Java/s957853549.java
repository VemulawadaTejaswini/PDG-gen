import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            System.out.println(run(n));
        }
    }
    static long run(int n){
        long ans =-100000;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                if(sum>ans)ans=sum;
            }
        }
        return ans;
    }
}