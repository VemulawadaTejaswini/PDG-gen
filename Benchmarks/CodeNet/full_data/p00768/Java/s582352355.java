import java.util.*;
 
public class Main {
	     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		while(true){
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if(m==0 && t==0 && p==0 && r==0) break;
			
			int[][] a = new int[t][3];
			for(int i=0;i<t;i++) a[i][0] = i+1;
			int[][] b = new int[t][p];
			
			for(int i=0;i<r;i++){
				int c = sc.nextInt();
				int d = sc.nextInt()-1;
				int e = sc.nextInt()-1;
				int f = sc.nextInt();
				if(f==0){
					a[d][1] += (c + b[d][e]*20);
					a[d][2]++;
				}
				else b[d][e]++;
			}
			
			Arrays.sort(a, new Comparator<int[]>(){
				public int compare(int[] o1, int[] o2) {
					if(o1[2]==o2[2]){
						if(o1[1]==o2[1]) return o2[0]-o1[0];
						else return o1[1]-o2[1];
					}
					return o2[2]-o1[2];
				}
			});
			
			System.out.print(a[0][0]);
			for(int i=1;i<t;i++){
				if(a[i-1][2]==a[i][2] && a[i-1][1]==a[i][1]) System.out.print("=");
				else System.out.print(",");
				System.out.print(a[i][0]);
			}
			System.out.println();
		}
    }   
}