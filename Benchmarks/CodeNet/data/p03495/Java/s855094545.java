import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       int N=sc.nextInt();
       int K=sc.nextInt();
       
       int[] A=new int[N];
       for(int i=0;i<N;i++){
           A[i]=sc.nextInt();
       }
       Arrays.sort(A);
       
       int num=1;
       for(int i=1;i<N;i++){
           if(A[i-1]<A[i]){
               num++;
           }
       }
       
       int[] s=new int[num];
       s[0]=1;
       int count=0;
       for(int i=1;i<N;i++){
           if(A[i-1]<A[i]){
               count++;
           }
           s[count]++;
       }
       Arrays.sort(s);
       
       if(num<=K){
           System.out.println(0);
       }else{
           int ans=0;
           for(int i=0;i<num-K;i++){
               ans+=s[i];
           }
           System.out.println(ans);
       }
    }
}