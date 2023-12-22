import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		int countAns = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		String[] b = a.clone();

		//bubble sort
		for(int i = 0; i < n; i++) {
			for(int j = n - 2; j >= i; j--) {
				int ai = Integer.parseInt(a[j + 1].substring(1, 2));
				int aj = Integer.parseInt(a[j].substring(1, 2));
				if(aj > ai) {
					String tempStr = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tempStr;
				}
			}
		}

		//Selection sort
		for(int i = 0; i < n; i++) {
			int minj = i;
			for(int j = i; j < n; j++) {
				int aminj = Integer.parseInt(b[minj].substring(1, 2));
				int aj = Integer.parseInt(b[j].substring(1, 2));
				if(aj < aminj) {
					minj = j;
				}
			}
			if(minj != i) {
				String temp = b[i];
				b[i] = b[minj];
				b[minj] = temp;
			}
		}

		
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if(i != n - 1)
				System.out.print(" ");
		}
		System.out.println();
		System.out.println("Stable");
		for(int i = 0; i < n; i++) {
			System.out.print(b[i]);
			if(i != n - 1)
				System.out.print(" ");
		}
		System.out.println();
		if(Arrays.equals(a, b)) {
			System.out.println("Stable");
		}else {
			System.out.println("Not stable");
		}
	}
}
