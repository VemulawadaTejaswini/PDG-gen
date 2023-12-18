import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        long[] a=new long[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        
        long num=a[0];
        int count=0;
        int ans=0;
        for(int i=0;i<N-1;i++){
            count++;
            if(a[i]<a[i+1]){
                if(count>num){
                    ans+=count-num;
                }else if(count<num){
                    ans+=count;
                }
                count=0;
                num=a[i+1];
            }
        }
        count++;
        if(count>num){
            ans+=count-num;
        }else if(count<num){
            ans+=count;
        }
        System.out.println(ans);
    }
}