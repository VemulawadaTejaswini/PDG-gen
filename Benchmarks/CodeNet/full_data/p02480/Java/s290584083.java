import java.io.*;

public class Main{
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String str = br.readLine();
			x = Integer.parseInt(str);
		}catch(Exception e){
			x = 0;
		}

		System.out.println(x * x * x);
	}
}