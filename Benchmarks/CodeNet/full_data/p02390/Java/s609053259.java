import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		calc(str);
	}

	public static void calc(String str){
		int num = Integer.parseInt(str);
		int s,m,h;

		h = num/3600;
		m = (num-3600*h)/60;
		s = num - 3600*h -60*m;

		System.out.println(h+":"+m+":"+s);
		}
}