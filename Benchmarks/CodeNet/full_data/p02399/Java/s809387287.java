import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] i=str.split(" ");
		int a= Integer.parseInt(i[0]);
		int b= Integer.parseInt(i[1]);
		float c=(float)a/(float)b;
		System.out.println(a/b+" "+a%b+" "+c);
	}
}