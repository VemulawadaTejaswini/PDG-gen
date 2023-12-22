
import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int m=sc.nextInt();
		int[][] map=new int[h+1][w+1];
		
		int[] row=new int[h+1];
		int[] col=new int[w+1];
	
		
		for(int i=0;i<m;i++) {
			int thisrow=sc.nextInt();
			int thiscol=sc.nextInt();
			
			row[thisrow]++;
			col[thiscol]++;
			map[thisrow][thiscol]++;
		}
		
		long ans=0;
		for(int i=0;i<h+1;i++) {
			for(int j=0;j<w+1;j++) {
				long n=row[i]+col[j];
				if(map[i][j]!=0)n--;
				if(n>ans)ans=n;
			}
		}
		
		
		System.out.println(ans);

	}
	
	
}
