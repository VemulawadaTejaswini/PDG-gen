import java.io.BufferedReader;
import java.io.InputStreamReader;

public class itp1_4_c{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		double ans = 0;
		String[] str = line.split(" ");
		int a = Integer.parseInt(str[0]);
		String op = str[1];
		int b = Integer.parseInt(str[2]);
		
		switch(op){
			case "+":
				ans = a + b;
				break;
			case "-":
				ans = a - b;
				break;
			case "*":
				ans = a * b;
				break;
			case "/":
				ans = a / b;
				break;
			case "?":
				System.exit(0);
				break;
		}
		
		sb.append(ans).append("\n");
		System.out.print(sb);
	}
}