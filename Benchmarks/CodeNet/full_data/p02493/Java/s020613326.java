public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int i;
		int a[] = new int[100];
		int n = scan.nextInt();
		for (i = 0 ; i < n ; i++ ) {
			a[i] = scan.nextInt();
		}
		for (i = n - 1 ; i >= 0 ; i--) {
			if(i != 0 ){
				System.out.print(a[i] + " ");
			} else {
				System.out.println(a[i]);
				break;
			}
		}

	}