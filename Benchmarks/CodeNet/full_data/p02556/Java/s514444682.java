import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[][] points=new long[n][2];
		for(int i=0;i<n;i++){
			points[i][0]=sc.nextLong();
			points[i][1]=sc.nextLong();
		}
		long max=0;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++){
				long a=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
				if(a>max)
					max=a;
			}
		System.out.println(max);
	}
		
}