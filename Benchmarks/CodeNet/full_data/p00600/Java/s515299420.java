import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while(true){
				/* input from here */
				line = r.readLine();
				if(Integer.parseInt(line.split(" ")[0])==0){
					break;
				}
				//s: num of hot springs, d: num of districts
				int s, d, min=100, minindex=0;
				s = Integer.parseInt(line.split(" ")[0]);
				d = Integer.parseInt(line.split(" ")[1]);
				//shortest direct distance from hot springs to each district
				int[] stod = new int[d];
				Arrays.fill(stod, 100);
				for(int i=0;i<s;i++){
					line = r.readLine();
					String[] t = line.split(" ");
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
					String[] t = line.split(" ");
					for(int j=i+1;j<d;j++){
						dtod[i][j] = Integer.parseInt(t[j-i-1]);
					}
					for(int j=0;j<i;j++){
						dtod[i][j] = dtod[j][i];
					}
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
					//look for the next shortest distance from hot springs to a district
					int nextmin = 100, nextminindex = -1;
					boolean direct = true;
					for(int i=0;i<d;i++){
						if(!doneindex.contains(i)&&stod[i]>0){
							if(stod[i]>0&&stod[i]<nextmin){
								nextmin = stod[i];
								nextminindex = i;
							}
						}
					}
					//look for shortest path from each done-index
					int from = -1;
					for(Integer i : doneindex){
						if(dtod[i][nextminindex]>0&&dtod[i][nextminindex]<nextmin){
							nextmin = dtod[i][nextminindex];
							from = i;
							direct = false;
						}
					}
					dist[nextminindex] = nextmin;
					if(direct){
						sum += nextmin;
					} else {
						sum += dtod[from][nextminindex];
					}
					doneindex.add(nextminindex);
					restcount--;
				}

				/* processing till here */
				/* output */
				System.out.println(sum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}