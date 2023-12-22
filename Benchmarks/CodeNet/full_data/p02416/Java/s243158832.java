
import java.io.*;
public class Main {
	private static int sum;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		while(str.equals("0")!=true){
			sum=0;
			for(int i=0;i<str.length();i++){
				String a=str.substring(i, i+1);
				int n=Integer.parseInt(a);
				sum+=n;
			}
			System.out.println(sum);
			str=br.readLine();
		}
	}
}