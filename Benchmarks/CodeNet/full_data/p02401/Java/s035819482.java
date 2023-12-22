import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[] = str.split(" ");
		int a = 0;
		int b = 0;
		while(!strArray[1].equals("?")){
			a = Integer.parseInt(strArray[0]);
			b = Integer.parseInt(strArray[2]);
			if(strArray[1].equals("+")){
				System.out.println(a + b);
			}else if(strArray[1].equals("-")){
				System.out.println(a - b);
			}else if(strArray[1].equals("*")){
				System.out.println(a * b);
			}else{
				System.out.println((int)(a / b));
			}
			str = br.readLine();
			strArray = str.split(" ");
			a = Integer.parseInt(strArray[0]);
			b = Integer.parseInt(strArray[2]);
		}
	}
}