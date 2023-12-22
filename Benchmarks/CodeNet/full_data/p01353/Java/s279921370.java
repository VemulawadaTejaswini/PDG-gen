import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] e = new int[n][5];
		long sum = 0;
		for(int i=0;i<n;i++){
			e[i][0] = sc.nextInt();
			e[i][1] = sc.nextInt() - c;
			e[i][2] = b - sc.nextInt();
			e[i][3] = sc.nextInt();
			e[i][4] = e[i][0]/e[i][2];
			if(e[i][0]%e[i][2]!=0) e[i][4]++;
			sum += e[i][1];
		}
		Arrays.sort(e, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				return o2[3] - o1[3];
			}
		});
		
		double[][] f = new double[n][2];
		for(int i=0;i<n;i++){
			f[i][0] = i;
			f[i][1] = (double)e[i][1]/e[i][4];
		}
		Arrays.sort(f, new Comparator<double[]>(){
			public int compare(double[] o1, double[] o2) {
				if(o2[1]-o1[1]>0) return 1;
				else return -1;
			}
		});
		
		long dmg = 0;
		for(int i=0;i<n;i++){
			if(e[i][3]<=d) break;
			dmg += e[i][1];
		}
		
		int g;
		boolean flag = false;
		for(int i=0;i<n;i++){
			if(dmg>=a){
				flag = true;
				break;
			}
			g = (int)f[i][0];
			dmg += (e[g][4]-1)*sum;
			sum -= e[g][1];
			dmg += sum;
		}
		if(dmg>=a) flag = true;
		
		if(flag==true) System.out.println(-1);
		else System.out.println(dmg);
	}	
}