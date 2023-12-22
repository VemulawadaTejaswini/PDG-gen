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
		long dmg = 0;
		int g;
		boolean flag = true;
		for(int i=0;i<n;i++){
			e[i][0] = sc.nextInt();
			g = sc.nextInt() - c;
			e[i][1] = Math.max(g, 0);
			g = b - sc.nextInt();
			if(g<=0){
				flag = false;
				e[i][2] = -1;
			}else{
				e[i][2] = g;
			}
			e[i][3] = sc.nextInt();
			e[i][4] = e[i][0]/e[i][2];
			if(e[i][0]%e[i][2]!=0) e[i][4]++;
			sum += e[i][1];
			if(e[i][3]>d) dmg+=e[i][1];
		}
		
		if(flag==true){
			Arrays.sort(e, new Comparator<int[]>(){
				public int compare(int[] o1, int[] o2) {
					if(((double)o2[1]/o2[4])-((double)o1[1]/o1[4])>0) return 1;
					else return -1;
				}
			});	
				
			dmg -= sum;
			for(int i=0;i<n;i++){
				dmg += e[i][4]*sum;
				sum -= e[i][1];
			}
			if(dmg>=a) flag = false;
		}
		
		if(flag==true) System.out.println(dmg);
		else System.out.println(-1);
	}	
}