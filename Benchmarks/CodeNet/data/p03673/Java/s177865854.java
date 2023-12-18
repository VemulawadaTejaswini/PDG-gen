import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int b[] = new int[n];
		int bReverse[] = new int[n];

		for (int i=0; i<n; i++){
			b[i] = a[i];
			for (int j=0; j<=i; j++){
				bReverse[j] = b[i-j];
			}
			for (int j=0; j<=i; j++){
				b[j] = bReverse[j];
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i =0; i<n ;i++){
			if (i>0){
				sb.append(" ");
			}
			sb.append(b[i]);
		}
		System.out.println(sb.toString());
	}

}
