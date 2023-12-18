
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		String t = sb.append(s).reverse().toString();
		
		t = t.replace("maerd", "");
		t = t.replace("remaerd", "");
		t = t.replace("resare", "");
		t = t.replace("esare", "");
		
		if(t.isEmpty()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
