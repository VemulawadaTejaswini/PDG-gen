import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		double n = scan.nextInt();
		int[] data = new int[(int)n];
		double sum=0;
		while(n!=0){
			for(int i=0;i<n;i++){
				data[i]=scan.nextInt();
			}
			double ave=average(data,n);
			for(int i=0;i<n;i++){
				sum+=(data[i]*data[i]);
			}
			System.out.println(Math.sqrt(sum/n-ave*ave));
			n=scan.nextInt();
			data = new int[(int)n];
			sum=0;
		}
	}
	public static double average(int[] data,double n){
		double sum=0;
		for(int i=0;i<n;i++){
			sum+=data[i];
		}
		return sum/n;
	}
}