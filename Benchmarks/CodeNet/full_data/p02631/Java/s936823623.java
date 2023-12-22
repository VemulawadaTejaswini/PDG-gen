import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int []a = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		String ans = "";
		for (int i=0; i<n; i++){

			int xor = 0;
			boolean first = true;
			for (int j=0; j<n; j++){
				if (i != j){
					if (first){
						xor = a[j];
						first = false;
					} else {
						xor = xor ^ a[j];

					}
				}
			}
			if (i > 0){
				ans = ans + " ";
			}
			ans = ans + xor;
		}
		System.out.println(ans);
	}

}