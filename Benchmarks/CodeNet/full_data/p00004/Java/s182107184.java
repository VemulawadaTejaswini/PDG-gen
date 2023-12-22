import java.util.Scanner;

 public class Main{
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 double q,w,c,d;
		 q = 1;
		 w = 1;
		 double[] a = new double[6];
		 for(int b = 0; b < 6; b++){
			 a[b] = s.nextInt();
		 }
		 c = a[0];
		 d = a[3];
		 while(a[0] != a[3]){
			 if(a[0]<a[3]){
				 a[0] += c;
						 ++q;
			 }else if(a[0] > a[3]){
				 a[3] += d;
						 ++w;
			 }
		 }
			 a[1] = a[1]*q-a[4]*w;
			 a[2] = a[2]*q-a[5]*w;
			 a[2] = a[2]/a[1];
			 a[4] = a[4]*a[2];
			 a[5] = a[5]-a[4];
			 a[5] = a[5]/a[3];
			 System.out.printf("%.3f %.3f",a[5],a[2]);
		 }
	 }