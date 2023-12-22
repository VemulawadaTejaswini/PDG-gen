import java.util.Scanner;
import java.lang.Math;
public class Diviation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();
		int[] data = new int[n];
		double sum=0;
		while(n!=0){
			for(int i=0;i<n;i++){
				data[i]=scan.nextInt();
			}
			int ave=average(data,n);
			for(int i=0;i<n;i++){
				sum+=(data[i]*data[i]);
			}
			System.out.println(Math.sqrt(sum/n-ave*ave));
			n=scan.nextInt();
			data = new int[n];
			sum=0;
		}
	}
	public static int average(int[] data,int n){
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=data[i];
		}
		return sum/n;
	}
}