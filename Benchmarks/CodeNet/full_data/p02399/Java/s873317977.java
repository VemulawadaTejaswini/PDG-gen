import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,d,r;
		double f;
		
		String str=br.readLine();
		String[] num=str.split(" ");
		a=Integer.parseInt(num[0]);
		b=Integer.parseInt(num[1]);
		
		d=a/b;
		r=a%b;
		f=(double)a/b;
		
		System.out.println(d+" "+r+" "+f);
	}
}