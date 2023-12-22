import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s=reader.readLine();
			if(s==null)System.exit(0);
			String[] t=s.split(" ");
			int a,b;
			a=Integer.parseInt(t[0]);
			b=Integer.parseInt(t[1]);
			int sum=a+b;
			int co=0;
			while(sum>0){
				co++;
				sum/=10;
			}
			System.out.println(co);
		}
	
	}
}