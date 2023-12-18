
import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int k = std.nextInt();
		 double ans = 0.0;
		 for(int i=1;i<n+1;i++) {
			 if(i>=k) {
				 ans = ans + 1.0/(double)n;
			 }
			 else {
				 int num = (int) Math.pow(2,log(i,k));
				 double numd = (double)1/(double)num;
				 ans = ans + (double)(numd/(double)n);
			 }
		 }
		 System.out.println(ans);
	 }
	 static int log(int i,int k) {
		 int a = i;
		 for(int j=1;j<k;j++) {
			 a = a*2;
			 if(a>=k) {
				 return j;
			 }
		 }
		 System.out.println("error");
		 return 0;
	 }
}
