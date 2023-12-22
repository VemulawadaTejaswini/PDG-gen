import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		double[] arr = new double[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((arr[i]*arr[j])%1==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}