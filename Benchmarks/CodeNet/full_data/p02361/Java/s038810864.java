import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		String [] arr = str.split("\\s+");
		int np = Integer.parseInt(arr[0]);
		int numedge = Integer.parseInt(arr[1]);
		int source = Integer.parseInt(arr[2]);
		int[][] edges = new int[np][np];
		for (int i=0;i<numedge;i++){
			String tempstr = BR.readLine();
			String [] temparr = tempstr.split("\\s+");
			int p1 = Integer.parseInt(temparr[0]);
			int p2 = Integer.parseInt(temparr[1]);
			int w = Integer.parseInt(temparr[2]);
			edges[p1][p2] = w;
		}
		
		int[] Shortestpath = new int[np];
		
		for(int j=0;j<np;j++){	
			if (j==source){
				Shortestpath[j] = 0;
				continue;
			}else{
				List<Integer> list = new ArrayList<Integer>();	
				list.add(source);
				for (int k=0;k<np-1;k++){	
					if(list.get(list.size()-1)==j){	
						break;
					}else{
						int thislength = 100000;
						int nextpoint = 0;
						for (int tl=0;tl<np;tl++){
							if (thislength>edges[list.get(list.size()-1)][tl]&&!list.contains(tl)&&edges[list.get(list.size()-1)][tl]!=0){
								thislength = edges[list.get(list.size()-1)][tl];
								nextpoint = tl;
							}
						}
						if(thislength!=10000){
							list.add(nextpoint);
							Shortestpath[j]+=thislength;
						}
						
					}
				}
				if(list.get(list.size()-1)!=j){
					Shortestpath[j] = 0;
				}
			}
			
		}
		for (int y=0;y<np;y++){
			if (y!=source&&Shortestpath[y]==0){
				System.out.println("INF");
			}else{
				System.out.println(Shortestpath[y]);
			}
		}
	}
}