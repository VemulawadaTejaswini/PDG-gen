import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){

			String[] token = br.readLine().split(" ");
			int a = Integer.parseInt(token[0]);
			char op = token[1].charAt(0);
			int b = Integer.parseInt(token[2]);

			if(op == '?'){
				break;
			}

			if(op == '+'){
				sb.append((a + b) + "\n");
			}else if(op == '-'){
				sb.append((a - b) + "\n");
			}else if(op == '*'){
				sb.append((a * b) + "\n");
			}else if(op == '/'){
				sb.append((a / b) + "\n");
			}

		}

		System.out.print(sb);

	}
}