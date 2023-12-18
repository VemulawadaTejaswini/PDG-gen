import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = String.valueOf(sc.next());
		String[] val = new String[value.length()];
		int sum=0;
		
		for (int i = 0; i < value.length(); i++) {
			val[i] = String.valueOf(value.charAt(i));
			sum=Integer.parseInt(val[i]);
		}

		if(Integer.parseInt(value)%sum==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
