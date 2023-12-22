import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		
		String[] num=str.split(" ");
		
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		
		System.out.println(a*b +" "+ (a+b)*2);

	}
}