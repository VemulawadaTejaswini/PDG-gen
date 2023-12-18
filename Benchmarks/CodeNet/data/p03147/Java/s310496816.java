import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int max =0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (A[i]>max) {
				max = A[i];
			}
		}
		int count =0;
		for (int i=0;i<max;i++) {
			int temp =0;
			while (temp<N) {
				boolean b = false;
				for (;temp<N;temp++) {
					if (A[temp]>0) {
						A[temp]--;
						b = true;
					} else if (b){
						break;
					}
				}
				if (b==true)
					count++;
			}
		}
		System.out.println(count);
	}
}