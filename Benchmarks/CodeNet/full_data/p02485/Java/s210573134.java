import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		for(int i=0;;i++){
			int a=0;
			String str= input.readLine();
			if(str.equals("0"))break;
			for(int k=0;k<str.length();k++){
				a+= str.charAt(k) - '0';
			}
			System.out.printf("%d\n",a);
		}
	}
}