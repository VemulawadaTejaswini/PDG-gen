import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] code = sc.next().toCharArray();
		boolean good = true;
		for(int i=0; i<3; i++)
			if(code[i]==code[i+1])
				good = false;
		System.out.println(good ? "Good" : "Bad");
		
		sc.close();
	}
}
