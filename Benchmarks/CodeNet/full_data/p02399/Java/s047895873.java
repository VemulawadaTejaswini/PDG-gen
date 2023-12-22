import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] i=str.split(" ");
		int a= Integer.parseInt(i[0]);
		int b= Integer.parseInt(i[1]);
		double c=(double)a/(double)b;
		System.out.print(a/b+" "+a%b+" ");
		System.out.printf("%.8f\n",c);
	}
}