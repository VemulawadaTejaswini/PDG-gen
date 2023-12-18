import java.util.Scanner;

public class Main {

	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 long k = std.nextLong();
		 int[] a = new int[n];
		 for(int i=0;i<n;i++) {
			 a[i] = std.nextInt();
		 }
		 long ans = 0;
		 for(int i=0;i<n;i++) {
			 long sum =0;
			 for(int j=i;j<n;j++) {
				 sum += a[j];
				 if(sum >=k) {
					 ans += n-j;
					 break;
				 }
			 }
		 }
		 System.out.println(ans);
	 }
}
