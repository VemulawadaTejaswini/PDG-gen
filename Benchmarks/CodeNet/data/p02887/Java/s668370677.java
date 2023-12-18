import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int n2 = n;

		char[] a = stdIn.next().toCharArray();
	

		for(int i = 0; i < n-1; i++) {
			if(a[i] == a[i+1]) {
				n2--;
			}
		}
		System.out.println(n2);
	}

}
