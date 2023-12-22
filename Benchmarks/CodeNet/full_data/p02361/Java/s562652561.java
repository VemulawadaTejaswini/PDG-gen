import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		int np = Integer.parseInt(str.substring(0,str.indexOf(" ")));
		int numedge = Integer.parseInt(str.substring(str.indexOf(" ")+1,str.indexOf(" ")+2));
		int source = Integer.parseInt(str.substring(str.indexOf(" ")+3));
		int[][] edges = new int[np][np];
		for (int i=0;i<numedge;i++){
			String tempstr = BR.readLine();
			int p1 = Integer.parseInt(tempstr.substring(0,tempstr.indexOf(" ")));
			int p2 = Integer.parseInt(tempstr.substring(tempstr.indexOf(" ")+1,tempstr.indexOf(" ")+2));
			int w = Integer.parseInt(tempstr.substring(tempstr.indexOf(" ")+3));
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
						int thislength = 10000;
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