import java.util.*;


public class Main {
	static int j =0;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int c=0;
		 for(int i=0;i<x;i++) {
			 int a= sc.nextInt();
			 int b= sc.nextInt();
			 double d= a*a +b*b ;
			 if(Math.sqrt(d)<=y) {
				 c++;
			 }
		 }
		 System.out.println(c);
	}


}
