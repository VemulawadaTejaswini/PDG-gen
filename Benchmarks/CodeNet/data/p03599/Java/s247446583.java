import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 int water,sugar;
	 Scanner sc=new Scanner(System.in);
	 int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt(),E=sc.nextInt(),F=sc.nextInt();
	 double noudo;
	 int maxm=0;
	 double limit=(double)E/((double)E+100.0);
	 int maxsugar=0;
	 double maxnoudo=0.0;
	 for(int a=0;a*A*100<=F;a++) {
		 for(int b=0;b*B*100<=F-a*A*100;b++) {
			 water=100*A*a+100*B*b;
			 //System.out.println("water:"+water);
			 if(water==0) {
				 continue;
			 }
			 for(int c=0;c*C<=F-a*A*100-b*B*100;c++) {
				 for(int d=0;d*D<=F-a*A*100-b*B*100-c*C;d++) {
				     sugar=c*C+d*D;
					 //System.out.println("sugar:"+sugar);
					 noudo=(double)sugar/((double)sugar+(double)water);
					 //System.out.println("noudo:"+noudo);
					 if(noudo>limit) {
						 break;
					 }
				 
				 if(noudo>maxnoudo) {
					 maxnoudo=noudo;
					 maxm=sugar+water;
					 maxsugar=sugar;
					 
				 }
				 }
				 
				 
			 }
			 
		 }
	 }
	 System.out.println(maxm+" "+maxsugar);
	 
 }
}