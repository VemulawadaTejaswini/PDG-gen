import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size==0) break;
			Building[] builds = new Building[size+1];
			for(int n=1; n<=size; n++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int id = Integer.parseInt(tmp[0]);
				int x = Integer.parseInt(tmp[1]);
				int y = Integer.parseInt(tmp[2]);
				builds[n] = new Building(id, x, y);
			}
			
			for(int n=1; n<size; n++){
				for(int m=n+1; m<=size; m++){
					int dx = builds[n].x - builds[m].x;
					int dy = builds[n].y - builds[m].y;
					double dist = Math.sqrt(dx * dx + dy * dy);
					if(dist <= 50.0){
						builds[n].edge_to.add(builds[m].id);
						builds[m].edge_to.add(builds[n].id);
						builds[n].edge_cost.add(dist);
						builds[m].edge_cost.add(dist);
					}
				}
			}
			
			line = in.readLine();
			size = Integer.parseInt(line);
			for(int n=0; n<size; n++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int s = Integer.parseInt(tmp[0]);
				int g = Integer.parseInt(tmp[1]);
				solve(builds, s, g);
				double cost = builds[g].cost;
				if(cost == -1.0){
					System.out.println("NA");
				}
				else{
					List<Integer> way = new ArrayList<Integer>();
					int m = g;
					while(m != -1){
						way.add(0, m);
						m = builds[m].parent;
					}
					
					for(int i=0; i<way.size(); i++){
						System.out.print(way.get(i));
						if(i!=cost) System.out.print(" ");
					}
					System.out.println();
				}
			}
		}
	}
	
	public void solve(Building[] builds, int s, int g){
		builds[s].cost = 0;
		builds[s].visited = true;
		List<Building> q = new ArrayList<Building>();
		q.add(builds[s]);
		
		while(q.size() != 0){
			Building dst = q.get(0);
			q.remove(0);
			for(int n=0; n<dst.edge_to.size(); n++){
				int to = dst.edge_to.get(n);
				double cost = dst.cost + dst.edge_cost.get(n);
				if(builds[to].cost > cost || builds[to].cost == -1){
					builds[to].cost = cost;
					builds[to].parent = dst.id;
					q.add(builds[to]);
				}
			}
		}
	}
}

class Building{
	int id;
	int x;
	int y;
	double cost;
	int parent;
	boolean visited;
	List<Integer> edge_to;
	List<Double> edge_cost;
	
	public Building(int id, int x, int y){
		this.id = id;
		this.x = x;
		this.y = y;
		this.parent = -1;
		this.cost = -1.0;
		this.visited = false;
		this.edge_to = new ArrayList<Integer>();
		this.edge_cost = new ArrayList<Double>();
	}
}