import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                int[] L = new int[N];

                for (int i = 0; i < N; i++) {
                	L[i] = scan.nextInt();
                }

                if (N == 1 || N == 2) {

                	System.out.println(0);

                } else {

                	int count = 0;

                	for (int i1 = 0; i1 < N-2; i1++) {
                		for (int i2 = i1+1; i2 < N-1; i2++) {
                			for (int i3 = i2+1; i3 < N; i3++) {
                				if (L[i1] != L[i2] && L[i2] != L[i3] && L[i3] != L[i1] && L[i1] + L[i2] > L[i3] && L[i2] + L[i3] > L[i1] && L[i3] + L[i1] > L[i2]) {
                					count++;
                				}
                			}
                		}
                	}

                	System.out.println(count);

                }

                scan.close();

        }

}