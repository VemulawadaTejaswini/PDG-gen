import java.io.*;

class Main
{
	public static void main ( String[] args ) throws IOException{
		Scanner sc = new Scanner ( System.in );
		String str1 =   sc.nextInt();
		String str2 =   sc.nextInt();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2); 
		
		System.out.println( a * b );
		System.out.println( 2+(a * b) );
	}
}