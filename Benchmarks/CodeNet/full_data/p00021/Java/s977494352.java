import java.util.*;
public class Main{
	public static void main(String[]agrs){
		Scanner sc=new Scanner(System.in);
		double A,A1,B1,B,C,C1,D,D1,x1,x2;
		int kai=sc.nextInt();
		for(int i=0;i<kai;i++){	
		 A=sc.nextDouble();
		 A1=sc.nextDouble();
		 B=sc.nextDouble();
		 B1=sc.nextDouble();
		 C=sc.nextDouble();
		 C1=sc.nextDouble();
		 D=sc.nextDouble();
		 D1=sc.nextDouble();
		 x1=(B-A)*(D1-C1)-(D-C)*(B1-A1);
		 if(x1==0)System.out.println("YES");
		 else System.out.println("NO");
		}
		
		
		

	}
}