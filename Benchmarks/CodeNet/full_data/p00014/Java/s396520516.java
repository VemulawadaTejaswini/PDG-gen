import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			String s;
			int sum=0;
			int l=0;
			while((s=reader.readLine()) !=null){
				int d=Integer.parseInt(s);
				for(int i=0;i<(600/d);i++){
					sum +=d*l*l;
					l +=d;
				}
				System.out.println(sum);
				sum=0;
				l=0;
			}
		}catch(IOException e){
			System.exit(0);
		}
	}
}