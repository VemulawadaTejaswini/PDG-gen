import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext() ) {
			String[] put=sc.nextLine().split( " " );
			double x1= Double.parseDouble( put[0] ),y1= Double.parseDouble( put[1] ),x2=Double.parseDouble( put[2] ), y2= Double.parseDouble( put[3] );
			double x3 = Double.parseDouble( put[4] ),y3= Double.parseDouble( put[5] ),x4= Double.parseDouble( put[6] ),y4= Double.parseDouble( put[7] );
			double v1x=x1-x2,v1y=y1-y2,v2x=x3-x4,v2y=y3-y4;
			if ( v1x*v2x+v1y*v2y==0.0) System.out.println( "YES" );
			else System.out.println( "NO" );

		}   
	}    
}