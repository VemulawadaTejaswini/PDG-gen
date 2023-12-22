import java.util.Scanner;

class Main{	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double x=0,y=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			
			
			
			if(a*e-b*d != 0){
				x = (double)( (int) ( ( (double)(c*e-b*f) / (double)(a*e-b*d) + 0.0005 )*100 ) )/100;
				y = (double)( (int) ( ( (double)(c*d-a*f) / (double)(b*d-a*e) + 0.0005 )*100 ) )/100;
			}
			System.out.println(x+" "+y);
		}
		
	}
}