import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num1=Integer.parseInt(str);

		double num2=Math.pow(num1,2);
		int num3=(int)num2;
		System.out.println(num3);
	}
}
