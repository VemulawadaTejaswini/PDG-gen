import java.io.*;

class Main{
	public static void main (String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String stra = reader.readLine();
		String strb = reader.readLine();
		int a = Integer.parseInt(stra);
		int b = Integer.parseInt(strb);
		System.out.print(a*b);
		System.out.print(" ");
		System.out.print((a+b)*2);
	}
}