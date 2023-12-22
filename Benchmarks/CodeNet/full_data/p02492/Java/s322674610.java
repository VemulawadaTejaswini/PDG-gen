import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String array[] = new String[3];
		array = str.split(" ");
		int left = Integer.parseInt(array[0]);
		int right = Integer.parseInt(array[2]);
		String op = array[1];
		if (op.equals("+")) { System.out.println(left + right);}
		else if (op.equals("-")) { System.out.println(left - right);}
		else if (op.equals("*")) { System.out.println(left * right);}
		else if (op.equals("/")) { System.out.println(left / right);}
		else {}
	}
}