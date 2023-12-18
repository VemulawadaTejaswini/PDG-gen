import java.util.Scanner;

public class Main{
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int x = std.nextInt();
		 int[] l = new int[n];
		 for(int i=0;i<n;i++) {
			 l[i] = std.nextInt();
		 }
		 int d=0;
		 for(int i=0;i<n+1;i++) {
			 d+=l[i];
			 if(d>x) {
				 System.out.println(i+1);
				 break;
			 }
		 }
	 }
}
