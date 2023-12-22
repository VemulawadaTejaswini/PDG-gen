import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
			double []a=new double[(int) n];
			for(long i=0;i<n;i++) {
				a[(int) i]=sc.nextDouble();
			}
			long sum=0;
			for(long i=0;i<n;i++) {
				for(long j=i+1;j<n;j++) {
					double var=a[(int) i]*a[(int) j];
					if(Math.ceil(var)==var) {
						System.out.println(var);
						sum++;
					}
				}
			}
			System.out.println(sum);
		
	}
}