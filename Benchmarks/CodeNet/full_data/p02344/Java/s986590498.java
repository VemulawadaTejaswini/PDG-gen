

import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = 0;
				int op_num = 0;
				n  = sc.nextInt();
				op_num = sc.nextInt();
				String[] op = new String[op_num+1];
				for (int i = 0 ; i < op.length; i++) {
					op[i] = sc.nextLine();
				}
				//get datag
				int[][] data = new int[op_num][3];
				for (int i = 1, n1 =0; i<= op_num; i++,n1++) {
					if(data[n1][0] == 0) {
						String[] Split = op[i].split(" ");
						data[n1] = new int[Split.length];
						for(int j = 0;j<Split.length;j++)
							data[n1][j] = Integer.parseInt(Split[j]);
					}else {
						String[] Split = op[i].split(" ");
						data[n1] = new int[Split.length];
						for(int j = 0;j<Split.length;j++)
							data[n1][j] = Integer.parseInt(Split[j]);
					}
				}
				
				
				
				
				
				
				//Operate data
				Set2 set = new Set2(n);
				set.makeset();
				
				for(int i= 0 ;i < data.length;i++ ) {
					if(data[i][0] == 0) {
						int x = data[i][1];
						int y = data[i][2];
						int z = data[i][3];
						set.link(x, y, z);	
					}
					else if(data[i][0] == 1){
						int x = data[i][1];
						int y = data[i][2];
						
						if(set.findset(x)== set.findset(y))
							System.out.println(set.we[y] - set.we[x]);
						else 
							System.out.println("?");
					}
					
				}
	}
}


class Set2{

	int[] rank,parent;
	int n;
	int weight;
	int[] we;
	int index;
	private static final int INF = Integer.MAX_VALUE;
	
	
	public Set2(int n) {
		rank = new int[n];
		parent = new int[n];
		we = new int[n];
		this.n = n;
		makeset();
	}
	
	void makeset() {
		for(int i= 0 ; i< n; i++)
			parent[i] = i;
	}
	
	int findset(int x) {
		int y = 0;
		if (x == parent[x])
			return x;
		else {
			int temp = parent[x];
			parent[x] = findset(parent[x]);
			we[x] += we[temp]; 
			return parent[x];
		}
	}
	
	void link(int x, int y, int z) {
		int a = findset(x);
		int b = findset(y);
		//int c = findset(z);
		
		if(a!=b) {
			parent[b] = a;
			we[b] = we[x] - we[y] + z;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
