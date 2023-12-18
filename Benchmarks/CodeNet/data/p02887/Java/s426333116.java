import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int n2 = n;

		String [] a = new String[n];

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.next();
		}
		
		for(int i = 0; i < n-1; i++) {
			if(a[i].equals(a[i+1])) {
				n2--;
			}
		}
		System.out.println(n2);
	}

}
