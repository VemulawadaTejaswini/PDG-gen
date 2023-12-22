import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=r.readLine())!=null){
			double n=Double.parseDouble(s);
			int ans=0;
			double f=(n*n/19.6);
			ans=(int)(f/5+2);
			System.out.println(ans);
		}
	}
}