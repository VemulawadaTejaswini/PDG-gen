import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        long[] C=new long[N-1];
        long[] S=new long[N-1];
        long[] F=new long[N-1];
        for(int i=0;i<N-1;i++){
            C[i]=sc.nextInt();
            S[i]=sc.nextInt();
            F[i]=sc.nextInt();
        }
        
        long[] t=new long[N];
        for(int i=0;i<N;i++){
            t[i]=0;
        }
        
        for(int q=0;q<N-1;q++){
            for(int i=q;i<N-1;i++){
                if(t[q]<=S[i]){
                    t[q]=S[i]+C[i];
                }else if(t[q]%F[i]==0){
                    t[q]+=C[i];
                }else{
                    t[q]=(t[q]/F[i]+1)*F[q]+C[i];
                }
            }
        }
        
        for(int i=0;i<N;i++){
            System.out.println(t[i]);
        }
    }
}
