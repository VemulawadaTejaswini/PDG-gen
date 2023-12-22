import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean isEnd=true;
		while (true) {
			String[] index = reader.readLine().split(" ");
			int a = Integer.parseInt(index[0]);
			int b = Integer.parseInt(index[2]);
			String op=index[1];
			int result = 0;
			if(index[1].equals("?")) break;			
	switch (op) {
			case "+":
				result = a + b;
				sb.append(result).append("\n");
				break;
			case "-":
				result = a - b;
				sb.append(result).append("\n");
				break;
			case "*":
				result = a * b;
				sb.append(result).append("\n");
				break;
			case "/":
				result = a / b;
				sb.append(result).append("\n");
				break;
		}
		}
		System.out.println(sb);
	}

}