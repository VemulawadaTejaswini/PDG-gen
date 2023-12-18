import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int m = sc.nextInt();
	  int []a = new int[n];
	  //int []b = new int[n];
	  //int []c = new int[n];
	  for(int i = 0;i < n;i++) {
		  a[i] = sc.nextInt();
		  //b[i] = a[i];
		  //c[i] = 0;
	  }
	  int lon = a.length - 1;
	  for(int i = 0;i < m;i++) {
		  Arrays.sort(a);
		  a[lon] = a[lon] / 2;
	  }

	  long sum = 0;
	  for(int i = 0;i < n;i++) {
		  sum = sum + a[i];
	  }
	  System.out.println(sum);
	}
}