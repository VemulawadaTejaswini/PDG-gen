import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mapping[] = new int [10000];
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			if(n==0){break;}

			for (int i=0; i<n; i++){
				String nodeline[] = br.readLine().split(" ");
				int node1 = Integer.parseInt(nodeline[0]) -1;
				int node2 = Integer.parseInt(nodeline[1]) -1;
				mapping[node1*100+node2]++;
				mapping[node2*100+node1]++;
			}

			int answer = 0;
			for (int i=0; i<100; i++){
				answer = Math.max(answer, run(mapping,i,-1,0));
			}
			 System.out.println(answer);
		}
	}


	static int run(int[] maparray, int now, int prev, int length){

		if(prev!=-1){
			maparray[now*100+prev]--;
			maparray[prev*100+now]--;
		}

		int lengmax = length;
		for (int i=0; i<100; i++){
			if(maparray[now*100+i]!=0){
				lengmax =  Math.max(run(maparray, i, now, length+1),lengmax);
			}
		}

		if(prev!=-1){
			maparray[now*100+prev]++;
			maparray[prev*100+now]++;
		}
		return lengmax;
	}
}