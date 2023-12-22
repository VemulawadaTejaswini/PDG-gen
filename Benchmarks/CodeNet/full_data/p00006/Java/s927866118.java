
import java.io.*;

public class k{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		StringBuffer str = new StringBuffer(str1);
		StringBuffer str2 = new StringBuffer(str).reverse();
		System.out.println(str2);

		}
	}