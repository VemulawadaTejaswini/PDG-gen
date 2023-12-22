import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String name="";
		while(N>26){
			name = Character.toString(96+((int)N%26)) + name;
			N /= 26;
		}
		name += Character.toString(96+((int)N%26));
		System.out.println(name);
	}
}