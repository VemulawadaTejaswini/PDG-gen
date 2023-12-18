import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MAX = 100000+24;
    private static boolean[] isPrime=new boolean[MAX];
    private static int[] Prime=new int[MAX];
    private static long[] Sum=new long[MAX];
    public static void makePrime(){
        Arrays.fill(isPrime,false);
        Arrays.fill(Sum,0);
        int tot=0; isPrime[1]=isPrime[0]=true;
        for(int i=2;i<MAX;i++){
            if(!isPrime[i]){
                Prime[tot++]=i;
            }
            for(int j=0;j<tot;j++){
                if(i*Prime[j]>=MAX) break;
                isPrime[i*Prime[j]] = true;
                if(i%Prime[j] == 0) break;
            }
            if( !isPrime[i] && !isPrime[(i+1)/2]){
                Sum[i]++;
            }
            Sum[i]+=Sum[i-1];
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        makePrime();
        while(in.hasNext()) {
            int Q=in.nextInt();
            for(int i=1;i<=Q;i++){
                int l=in.nextInt(),r=in.nextInt();
                out.println(Sum[r]-Sum[l-1]);
            }
            out.flush();
        }
        in.close();
        out.close();
    }

}
