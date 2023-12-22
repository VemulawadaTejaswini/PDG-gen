import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] C = new String[n];


		for(int i = 0; i < n; i++) {
			C[i] = scan.next();
		}

		String[] B = C.clone();
		String[] A = B.clone();

		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				if(C[j].toCharArray()[1] < C[j - 1].toCharArray()[1]) {
					String temp = C[j];
					C[j] = C[j - 1];
					C[j - 1] = temp;
				}
			}
		}

		for(int i = 0; i < n; i++) {
			int min = i;
			for(int j = i; j < n; j++) {
				if(B[j].toCharArray()[1] < B[min].toCharArray()[1]) {
					min = j;
				}
			}
			String temp = B[i];
			B[i] = B[min];
			B[min] = temp;
		}

		for(int i = 0; i < n - 1; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println(C[n-1]);

		System.out.println(stable(A, C));

		for(int i = 0; i < n - 1; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println(B[n-1]);
		System.out.println(stable(A, B));

		scan.close();
	}
	public static String stable(String[] A, String[] B) {
		boolean flag = true;

		for(int i = 0; i < B.length; i++) {
			int index = B[i].toCharArray()[1];
			String s = "";

			for(int j = 0; j < B.length; j++) {
				if(B[j].toCharArray()[1] == index) {
					s += B[j].toCharArray()[0];
				}
			}

			char[] sc = s.toCharArray();
			int count = 0;
			for(int k = 0; k < A.length; k++) {
				if(A[k].toCharArray()[1] == index) {
					if(A[k].toCharArray()[0] == sc[count]){
						count++;
					} else {
						flag = false;
						break;
					}
				}

			}

			if(flag == false) {
				break;
			}
		}

		if(flag) {
			return "Stable";
		} else {
			return "Not stable";
		}

	}

}
