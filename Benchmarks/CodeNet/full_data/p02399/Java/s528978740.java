import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args){

		String str = null;
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] str1;
		int a,b,c,d,r;
		double f;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}
		
		
		str1 = str.split(" ");
		a = Integer.parseInt(str1[0]);
		b = Integer.parseInt(str1[1]);
		d=a/b;
		r=a%b;
		double a1=a;
		double b2=b;
		f=a1/b2;
		
		System.out.println(d+" "+r+" "+f);
		}
}