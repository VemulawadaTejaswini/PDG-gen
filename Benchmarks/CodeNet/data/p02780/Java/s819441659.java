import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int[] arr= new int[a];
		for(int i=0;i<a; i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a-b; i++) {
			int sum=0;
			for(int j=i;j<i+b; j++) {
				sum+=arr[j];
			}
			if(sum>max) {
				max=sum;
			}
		}	
		System.out.printf("%.9f\n", (max+b)/2.0);
		
	}
}
