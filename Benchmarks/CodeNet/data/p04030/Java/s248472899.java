import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.next().split("");
		String result ="";
		for(String w:s) {
			if(w.equals("0") || w.equals("1")) result+=w;
			if(w.equals("B") && result.length()>0)result = result.substring(0, result.length()-1);
		}
		System.out.println(result);
	}

}