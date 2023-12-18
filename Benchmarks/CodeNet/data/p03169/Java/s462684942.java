import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static boolean[][][] found;
    public static double[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] lo = reader.readLine().split(" ");
        int two = 0,one =0,three=0;
        for (int i = 0; i <N ; i++) {
            int y = Integer.parseInt(lo[i]);
            if(y==1) one++;
            else if(y==2) two++;
            else three++;
        }
        found = new boolean[one+two+three+1][two+three+1][three+1];
        dp = new double[one+two+three+1][two+three+1][three+1];
        System.out.println(rec(one,two,three,N));
    }
    public static double rec(int one,int two,int three,int N){
        if(one<0 || two<0 ||three<0) return 0.0;
        else if(found[one][two][three]) return dp[one][two][three];
        else if(one==0 && two==0 && three==0){
            found[one][two][three]=true;
            return 0.0;
        }
        else{
            found[one][two][three]=true;
            dp[one][two][three] =  (N/(double)(one+two+three) + ((double)(one)/(double)(one+two+three))*rec(one-1,two,three,N)+
                    ((double)(two)/(double)(one+two+three))*rec(one+1,two-1,three,N) +
                    ((double)(three)/(double)(one+two+three))*rec(one,two+1,three-1,N));
            return dp[one][two][three];
        }
    }
}
