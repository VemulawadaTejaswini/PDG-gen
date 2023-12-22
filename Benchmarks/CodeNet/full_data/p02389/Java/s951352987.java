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
		String[] result = str.split(" ");

		int num1 = Integer.parseInt(result[0]);
		int num2 = Integer.parseInt(result[1]);

		int res1 = num1*num2;
		int res2 = (num1+num2)*2;

		System.out.println(Integer.toString(res1)+" "+Integer.toString(res2));
		}
}