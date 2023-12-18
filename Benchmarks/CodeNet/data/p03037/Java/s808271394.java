import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int m = std.nextInt();
		 int[][] lr = new int[m][2];
		 for(int i=0;i<m;i++) {
			 lr[i][0]= std.nextInt();
			 lr[i][1]=std.nextInt();
		 }
		 int max = lr[0][0];
		 int min = lr[0][1];
		 for(int i=1;i<m;i++) {
			 if(max<lr[i][0]) {
				 max = lr[i][0];
			 }
			 if(min>lr[i][1]) {
				 min = lr[i][1];
			 }
		 }
		 System.out.println(min-max+1);
	 }
	 static int max(int[] lr) {
		 int max = lr[0];
		 for(int i=0;i<lr.length-1;i++) {
			 if(max<lr[0]) {
				 max = lr[i];
			 }
		 }
		 return max;
	 }

}
