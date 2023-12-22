import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,w;
		String[] str;
		str=br.readLine().split(" ");
		while(str.length!=1){
			StringBuilder out=new StringBuilder();
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
			w=a+b;
			out.append(w);
			w=out.length();
			System.out.println(w);
			str=br.readLine().split(" ");
		}
		System.out.print("\n");
	}
}