import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,h,m,s;;
		a=Integer.parseInt(br.readLine());
		h=a/3600;
		m=(a-h*3600)/60;
		s=a-(h*3600+m*60);

		System.out.println(h + ":" + m + ":"+s);




	}
}