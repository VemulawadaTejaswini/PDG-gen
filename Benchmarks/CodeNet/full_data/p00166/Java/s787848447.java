import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int m = sc.nextInt();
			if(m==0) break;
			
			double sum1 = 0;
			int sumd = 0;
			int v;
			for(int i=0;i<m-1;i++){
				v = sc.nextInt();
				sum1 += Math.sin(v*Math.PI/180);
				sumd += v;
			}
			sum1 += Math.sin((360-sumd)*Math.PI/180);
			sum1 = (double)((int)(sum1*1000000))/1000000;
			
			int n = sc.nextInt();
			sumd = 0;
			double sum2 = 0;
			for(int i=0;i<n-1;i++){
				v = sc.nextInt();
				sum2 += Math.sin(v*Math.PI/180);
				sumd += v;
			}
			sum2 += Math.sin((360-sumd)*Math.PI/180);
			sum2 = (double)((int)(sum2*1000000))/1000000;
			
			if(sum1==sum2) System.out.println(0);
			else if(sum1>sum2) System.out.println(1);
			else System.out.println(2);
		}	
	}	
}