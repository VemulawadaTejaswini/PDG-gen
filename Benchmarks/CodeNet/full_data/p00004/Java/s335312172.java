import java.util.Scanner;
public Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f;
		double x,y;

		while(sc.hasNext()){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			f=sc.nextInt();
			y=(double)(c*d-a*f)/(b*d-a*e);
			x=(double)(c-b*y)/a;
			
			System.out.printf("%.3f %.3f\n",x,y);
	
			}
		
	}

}