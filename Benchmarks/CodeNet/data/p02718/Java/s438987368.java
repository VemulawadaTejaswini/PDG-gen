import java.util.Scanner;
import java.util.Arrays;
public class Main {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int sum = 0;
		 int array[] = new int [n];
		 for(int i = 0; i < n;i++) {
			array[i] = sc.nextInt();
			sum+=array[i];
		} 
		 Arrays.sort(array);
		 
		 if((double)array[n-m]>=(double)sum/(4*(double)m)) 
				System.out.println("Yes");
		    else
				System.out.println("NO");
	}
}