import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int modBase = 1000000007;
        final int heightMax = 1000000000;
        int N = Integer.parseInt(br.readLine());
        int[] takahashi = new int[N+2];
        int[] aoki      = new int[N+2];
        //[0] and [N+1] are dummy datas; used to avoid array exc.
        
        String[] line = br.readLine().split(" ");
        for(int i=1;i<=N;i++) takahashi[i] = Integer.parseInt(line[i-1]);
        line = br.readLine().split(" ");
        for(int i=1;i<=N;i++) aoki[i] = Integer.parseInt(line[i-1]);
        takahashi[0]  =0;
        takahashi[N+1]=heightMax+1;
        aoki[0]       =heightMax+1;
        aoki[N+1]     =0;
        
        long answer = 1;
        for(int i=1;i<=N;i++){
        	boolean takHighest = (takahashi[i] > takahashi[i-1]);
        	int takMin,takMax;
        	if(takHighest){
        		takMin = takahashi[i];
        		takMax = takahashi[i];
        	}else{
        		takMin = 1;
        		takMax = takahashi[i];
        	}
        	boolean aokHighest = (aoki[i]      > aoki[i+1]);
        	int aokMin,aokMax;
        	if(aokHighest){
        		aokMin = aoki[i];
        		aokMax = aoki[i];
        	}else{
        		aokMin = 1;
        		aokMax = aoki[i];
        	}
        	int min = Math.max(takMin,aokMin);
        	int max = Math.min(takMax,aokMax);
        	int range = max-min+1;
        	if(range<0)range=0;
        	answer = (answer*range)%modBase;
        }
        System.out.println(answer);
    }
}