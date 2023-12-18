import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    	// Solution sol = new Solution();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(br.readLine());
    	HashMap<Integer, Integer> hm = new HashMap();
    	int[] arr = new int[N];
    	int[][] count = new int[N+1][3];
    	for(int i=0; i<N; i++){
    		arr[i]=Integer.parseInt(st.nextToken());
    		count[arr[i]][0]++;
    	}
    	int sum=0;
    	for(int i=1; i<=N; i++){
    		count[i][1]=count[i][0]*(count[i][0]-1)/2;
    		count[i][2]=(count[i][0]-1)*(count[i][0]-2)/2;
    		sum+=count[i][1];
    	}
    	for(int i=0; i<N; i++){
    		System.out.println(sum-count[arr[i]][1]+count[arr[i]][2]);
    	}

    }
}