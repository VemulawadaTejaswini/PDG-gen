import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scan.nextInt();
		}
		int count = 0;
		int sum = 0;
		for(int i=0; i<n-1; i++){
			sum = sum+a[i];
			if(sum>0){
				if(sum+a[i+1]<0){continue;}
				
				int p = -1-a[i+1]-sum;
				count = count + Math.abs(p);
				a[i+1] = a[i+1] + p;
			}
			else if(sum<0){
				if(sum+a[i+1]>0){continue;}
				
				int b = 1-a[i+1]-sum;
				count = count + Math.abs(b);
				a[i+1] = a[i+1] + b;
			}
		}
		System.out.println(count);
 	}
}