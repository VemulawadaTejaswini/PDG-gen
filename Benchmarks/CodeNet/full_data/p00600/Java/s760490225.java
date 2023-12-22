import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(true){
			/* input from here */
			line = r.readLine();
			//s: num of hot springs, d: num of districts
			int s, d, min=100, minindex=0;
			s = Integer.parseInt(line.split("[ \t]")[0]);
			d = Integer.parseInt(line.split("[ \t]")[1]);
			if(s==0&&d==0){
				break;
			}
			//shortest direct distance from hot springs to each district
			int[] stod = new int[d];
			Arrays.fill(stod, 101);
			for(int i=0;i<s;i++){
				line = r.readLine();
				String[] t = line.split("[ \t]");
				for(int j=0;j<d;j++){
					int distj = Integer.parseInt(t[j]);
					if(distj>0&&distj<stod[j]){
						stod[j] = distj;
						if(distj<min){
							min = distj;
							minindex = j;
						}
					}
				}
			}
			//distance between districts
			int[][] dtod = new int[d][d];
			for(int i=0;i<d-1;i++){
				line = r.readLine();
				String[] t = line.split("[ \t]");
				for(int j=i+1;j<d;j++){
					dtod[i][j] = Integer.parseInt(t[j-i-1]);
				}
				for(int j=0;j<i;j++){
					dtod[i][j] = dtod[j][i];
				}
			}
			for(int j=0;j<d-1;j++){
				dtod[d-1][j] = dtod[j][d-1];
			}
			/* input till here */
			/* processing from here */
			//shortest distance from a hot spring to the district 
			int[] dist = new int[d];
			ArrayList<Integer> doneindex = new ArrayList<Integer>();
			dist[minindex] = min;
			doneindex.add(minindex);
			int restcount = d-1, sum = min;
			while(restcount>0){
				int nextmin = 101, nextminindex = -1;
				for(int i=0;i<d;i++){
					if(doneindex.contains(i)){
						continue;
					}
					if(stod[i]>0&&stod[i]<nextmin&&!doneindex.contains(i)){
						nextmin = Math.min(stod[i],nextmin);
						nextminindex = i;
					}

					for(Integer j : doneindex){
						if(dtod[j][i]>0&&dtod[j][i]<nextmin){
							nextmin = Math.min(dtod[j][i], nextmin);
							nextminindex = i;
						}
					}
				}
				sum += nextmin;
				doneindex.add(nextminindex);
				restcount--;
			}

			/* processing till here */
			/* output */
			System.out.println(sum);
		}
	}
}