import java.io.*;
class Cubic {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		  System.out.print(a*b);
		  System.out.print(" ");
		  System.out.println(2*(a+b));
		
	}

}