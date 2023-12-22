import java.util.*;

public class Main {
	int n, len;
	double min;
	int[] r;
	double[][] cost;
	
	void check(int[] perm){
		double sum = r[0] + r[1];
		
		for(int i=0;i<n-1;i++){
			if(i==0) sum += cost[r[0]][r[perm[0]+2]];
			else if(i==n-2) sum += cost[r[perm[n-3]+2]][r[1]];
			else sum += cost[r[perm[i-1]+2]][r[perm[i]+2]];
		}
		min = Math.min(min, sum);
		
		for(int i=0;i<n-1;i++){
			if(i==0) sum += cost[r[1]][r[perm[0]+2]];
			else if(i==n-2) sum += cost[r[perm[n-3]+2]][r[0]];
			else sum += cost[r[perm[i-1]+2]][r[perm[i]+2]];
		}
		min = Math.min(min, sum);
	}
	
	void makeperm(int k, int[] perm, boolean[] flag){
		if(k==n-2){
			check(perm);
		}else{
			for(int i=0;i<n-2;i++){
				if(flag[i]==true) continue;
				perm[k] = i;
				flag[i] = true;
				makeperm(k+1, perm, flag);
				flag[i] = false;
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);

		cost = new double[11][11];
		for(int i=3;i<11;i++){
			for(int j=i;j<11;j++){
				cost[i][j] = Math.sqrt((j+i)*(j+i) - (j-i)*(j-i));
				cost[j][i] = cost[i][j];
			}
		}
		
		while(sc.hasNext()){
			String[] s = sc.nextLine().split(" ");
			n = s.length-1;
			len = Integer.valueOf(s[0]);
			r = new int[n];
			for(int i=0;i<n;i++) r[i] = Integer.valueOf(s[i+1]);
			Arrays.sort(r);
			
			min = Integer.MAX_VALUE;
			makeperm(0, new int[n-2], new boolean[n-2]);
			
			if(min<=len) System.out.println("OK");
			else System.out.println("NA");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}