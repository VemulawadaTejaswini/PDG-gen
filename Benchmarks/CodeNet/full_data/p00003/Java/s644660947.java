import java.util.Scanner;

 public class Main{
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 int b,x,max,SH;
		 SH = 0;
		 while(s.hasNextInt()){
		 x = s.nextInt();
		 int[][] a = new int[x][3];
		 for(b = 0; b < x; b++){
			 a[b][0] = s.nextInt();
			 a[b][1] = s.nextInt();
			 a[b][2] = s.nextInt();
		 }
		 for(b = 0; b < x; b++){
			 max = a[b][0];
			 if(a[b][1] > max)max = a[b][1];
			 if(a[b][2] > max)max = a[b][2];
			 if(max == a[b][0]){
				 SH = a[b][1]*a[b][1]+a[b][2]*a[b][2];
			 }else if(max == a[b][1]){
				 SH = a[b][0]*a[b][0]+a[b][2]*a[b][2];
			 }else if(max == a[b][2]){
				 SH = a[b][0]*a[b][0]+a[b][1]*a[b][1];
			 }
			 max = max*max;
			 if(SH == max){
				 System.out.println("YES");
			 }else{
				 System.out.println("NO");
			 }
		 }
		 }
	 }
 }