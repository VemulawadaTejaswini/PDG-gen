import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		double[][] xy=new double[n][2];		
		for (int i=0;i<n;++i) {
			xy[i][0]=Double.parseDouble(scan.next());
			xy[i][1]=Double.parseDouble(scan.next());
		}
	
		double sum=0;
		for (int i=0;i<n;++i) {
			for(int k=0;k<n;++k) {
				if(k==i) continue;
				sum+=Math.sqrt(Math.pow(xy[i][0]-xy[k][0],2)+Math.pow(xy[i][1]-xy[k][1],2));
			}
		}
		
		System.out.print(sum/n);
		
		
}		
}
//end