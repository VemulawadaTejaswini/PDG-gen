import java.io.*;

class Main{
	public static void main (String[] args)throws IOException{
		int a, b, men=0, len=0;
		
		BufferedReader x =new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(x.readLine());
		BufferedReader y =new BufferedReader(new InputStreamReader(System.in));
		b = Integer.parseInt(y.readLine());
		
		men = a*b;
		len = a*2+b*2;
		
		System.out.println(men+" "+len);
	}
}