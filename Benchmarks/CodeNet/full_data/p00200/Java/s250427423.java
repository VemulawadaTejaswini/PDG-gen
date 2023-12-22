import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();
		int n = Integer.valueOf(line.split(" ")[0]);
		int m = Integer.valueOf(line.split(" ")[1]);
		
		LinkedList<Rail> railList = new LinkedList<>();
		
		for(int i = 1; i <= n; i++){
			line = br.readLine();
			String[] nums = line.split(" ");
			int a = Integer.valueOf(nums[0]);
			int b = Integer.valueOf(nums[1]);
			int cost = Integer.valueOf(nums[2]);
			int time = Integer.valueOf(nums[3]);
			railList.add(new Rail(a, b, cost, time));
		}

		line = br.readLine();
		int k = Integer.valueOf(line);
		line = br.readLine();
		
		while(true){
			line = br.readLine();
			if(line.equals("0 0")){
				break;
			}
			
			String[] nums = line.split(" ");
			int p = Integer.valueOf(nums[0]);
			
		}
	}
	
	private static int getCost(LinkedList<Rail> railList, int p, int q){
		int min = 9999;
		int cost = 0;
		
		LinkedList<Rail> railListTmp = new LinkedList<>();
		while(!railList.isEmpty()){
			Rail rail = railList.pop();
			if((rail.getA() == p && rail.getB() == q) || (rail.getA() == q && rail.getB() == p)){
				cost = rail.getCost();
			}else if(rail.getA() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				cost = rail.getCost() + getCost(railListTmp2, rail.getB(), q);
			}else if(rail.getB() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				cost = rail.getCost() + getCost(railListTmp2, rail.getA(), q);
			}else{
				railListTmp.push(rail);
				continue;
			}
			
			if(min > cost){
				min = cost;
			}
		}
		return min;
	}

	
	private static int getTime(LinkedList<Rail> railList, int p, int q){
		int min = 9999;
		int time = 0;
		
		LinkedList<Rail> railListTmp = new LinkedList<>();
		while(!railList.isEmpty()){
			Rail rail = railList.pop();
			if((rail.getA() == p && rail.getB() == q) || (rail.getA() == q && rail.getB() == p)){
				time = rail.getTime();
			}else if(rail.getA() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				time = rail.getTime() + getTime(railListTmp2, rail.getB(), q);
			}else if(rail.getB() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				time = rail.getTime() + getTime(railListTmp2, rail.getA(), q);
			}else{
				railListTmp.push(rail);
				continue;
			}
			
			if(min > time){
				min = time;
			}
		}
		return min;
	}
	
	static class Rail {
		int a;
		int b;
		int cost;
		int time;
		
		public Rail(int a, int b, int cost, int time) {
			this.a = a;
			this.b = b;
			this.cost = cost;
			this.time = time;
		}
		
		public int getA() {
			return a;
		}
		public int getB() {
			return b;
		}
		public int getCost() {
			return cost;
		}
		public int getTime() {
			return time;
		}
	}

}