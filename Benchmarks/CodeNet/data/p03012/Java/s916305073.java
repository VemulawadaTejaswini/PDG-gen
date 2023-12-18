import java.util.Scanner;
public class Main{
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int[] w = new int[n];
		 int a = 0;
		 int b =0;
		 for(int i=0;i<n;i++) {
			 w[i] = std.nextInt();
			 b += w[i];
		 }

		 int last =b;
		 for(int i=0;i<n;i++) {
			 b -= w[i];
			 a += w[i];
			 int dis = Math.abs(b-a);
			 if(dis>last) {
				 break;
			 }
			 last = dis;
		 }
		 System.out.println(last);
	 }
}
