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
            time[a]=0;
        }
        time[N-1]=0;
        for(int a=0;a<N-1;a++){
            time[a] +=S[a]+C[a];
            for(int b=a+1;b<N-1;b++){
                    if(time[a] >=S[b]){
                        time[a]+=C[b];
                    }
                    else {
                        time[a]=0;
                        break;
                    }
                }
            }
            for(int a=0;a<N-1;a++){
            if(time[a]==0){
                for(int b=a+1;b<N-1;b++){
                    if(time[b]!=0) {
                        time[a] = time[b];
                        break;
                    }
                }

            }
            }
       for(int a=0;a<N;a++){
           System.out.println(time[a]);
       }
    }
}