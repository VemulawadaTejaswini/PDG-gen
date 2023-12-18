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
	  int max;
	  int maxj = -1;
	  for(int i = 0;i < m;i++) {
			  max = -1;
		  for(int j = 0;j < n;j++) {
			  if(max < a[j]) {
				  max = a[j];
				  maxj = j;
			  }
		  }
		  a[maxj] = a[maxj] / 2;
		  
	  }

	  long sum = 0;
	  for(int i = 0;i < n;i++) {
		  sum = sum + a[i];
	  }
	  System.out.println(sum);
	}
}