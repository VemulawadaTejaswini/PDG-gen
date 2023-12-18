import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String...args) {
        Main main= new Main();
        main.solve();
    }
    boolean[] exists;
    int[] factorials;
    void solve(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] p=new int[N];
        int[] q=new int[N];

        factorials=new int[N+1];
        factorials[0]=1;
        factorials[1]=1;
        for(int i=2;i<N;i++){
            factorials[i]=factorials[i-1]*(i);
        }
        for(int i=0;i<N;i++){
            p[i]=scanner.nextInt();
        }
        for(int i=0;i<N;i++){
            q[i]=scanner.nextInt();
        }
        exists =new boolean[N+1];
        int P=rank(p,N);
        int Q=rank(q,N);
        int result=Math.abs(P-Q);
        System.out.println(result);
    }

    int rank(int[] array,int n){
        Arrays.fill(exists,false);
        int sum=0;
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=0;j<array[i];j++){
                if(!exists[j]){
                    k++;
                }
            }
            sum=sum+factorials[n-1-i]*k;
            exists[array[i]]=true;
        }
        return sum;
    }
}




