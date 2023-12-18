import java.io.*;
public class Main{
	public static void main(String args[])throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String s1= br.readLine();
		String s2= br.readLine();
		String s3= br.readLine();
		String s4= br.readLine();
		if(((s1==s2)&&(s2==s3))||((s2==s3)&&(s3==s4)))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}