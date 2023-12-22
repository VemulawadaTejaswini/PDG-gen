import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[2]);
			String op = input[1];
			if (op.equals("+")){
				System.out.println(a + b);
			} else if (op.equals("-")){
				System.out.println(a - b);
			} else if (op.equals("*")){
				System.out.println(a * b);
			} else if (op.equals("/")){
				System.out.println(a / b);
			} else if (op.equals("?")){
				break;
			}			
		}
		
	}
}