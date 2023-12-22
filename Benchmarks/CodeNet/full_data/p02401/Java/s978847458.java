import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			String[] param = input.split(" ");
			String op = param[1];
			if(op.equals("?")){
				break;
			}
			Integer a = Integer.parseInt(param[0]);
			Integer b = Integer.parseInt(param[2]);
			switch(op){
				case "+":
					System.out.println(a + b);
					break;
				case "-":
					System.out.println(a - b);
					break;
				case "*":
					System.out.println(a * b);
					break;
				case "/":
					System.out.println(a / b);
					break;
			}
		}
	}
}