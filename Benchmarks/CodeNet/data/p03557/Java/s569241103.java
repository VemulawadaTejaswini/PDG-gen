import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long nibutan(long a[],long b,int n){
        int left=0;
        int right=n;
        while(left<right){
            int mid=(left+right)/2;
            if(a[mid]==b){
                right=mid;
            }else if(a[mid]<b){
                left=mid+1;
            }else if(a[mid]>b){
                right=mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        long A[]=new long[N];
        long B[]=new long[N];
        long C[]=new long[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            B[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            C[i]=sc.nextInt();
        }
        long ch1=0;
        long ch2=0;
        long ans=0;
        
        Arrays.sort(A);
        Arrays.sort(C);
        for(int i=0;i<N;i++){
            ch1=nibutan(A,B[i],N);
            ch2=N-nibutan(C,B[i]+1,N);
            ans+=ch1*ch2;
        }
        
        System.out.println(ans);
    }
}