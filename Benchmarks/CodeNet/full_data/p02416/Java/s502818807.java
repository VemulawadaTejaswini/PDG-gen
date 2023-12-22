import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		while(true){
			int sum = 0;
			String moji = scan.next();
			if(scan.equals("0")){
				break;
			}

			for(char c: moji.toCharArray()){
				sum += Integer.parseInt("" + c);
			}

			out.println(sum);
			out.flush();
		}
	}
}