import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		double A[]=new double[N];
		double B[]=new double[N];
		int i=0,j=0;
		int color=0;
		int count=0;
		
		for(i=0;i<N;i++){
			A[i]=s.nextInt();
		}
		Arrays.sort(A);
		
		for(i=0;i<N;i++){
			
		    count=0;
			
			for(j=0;j<N;j++){
				
				if(B[j]/B[i]<=2.0&&i!=j){
					B[i]+=B[j];
					count++;
				}
			}
			
			B[i]=A[i];
			
			if(count==N-1){
				color++;
			}
			
		}
		
		System.out.print(color);

	}

}