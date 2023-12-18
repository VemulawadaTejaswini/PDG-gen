import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] C = new int[N];
        int [] S = new int[N];
        int [] F = new int [N];
        int [] time = new int[N];
        for(int a=0;a<N-1;a++){
            C[a]=sc.nextInt();
            S[a] = sc.nextInt();
            F[a] = sc.nextInt();
        }
        time[N-1]=0;
       for(int a=N-2;a>=0;a--){
           if(a!=N-2){
               int etime = C[a]+S[a];
               if(etime>S[a+1]){
                   time[a]=etime;
                   for(int b=a+1;b<N-1;b++){
                       time[a]+=C[b];
                   }
               }
               else {
                   time[a]=time[a+1];
               }
           }
           else time[a]+=C[a]+S[a];
       }
       for(int a=0;a<N;a++){
           System.out.println(time[a]);
       }
    }
}