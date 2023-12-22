import java.io.*;

public class Main {
	public static void main(String[] a)  throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] s =br.readLine().split(" ");
		int num1 = Integer.parseInt(s[0]);
		int num2 = Integer.parseInt(s[1]);
		System.out.println(keta(num1,num2));
		
	}
	
	public static int keta(int a,int b){
		int num = a+b;
		int i=0;
		while(num != 0){
			num = num/10;
			i++;
		}
		return i;
	}
}