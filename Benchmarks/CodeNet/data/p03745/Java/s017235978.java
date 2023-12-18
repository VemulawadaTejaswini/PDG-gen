import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		if (N == 0) System.out.println(0);
		int[] array = new int[N];
		for (int i=0;i<N;i++){
			array[i] = cin.nextInt();
		}
		int i = 1;
		int res = 0;
		while (i < N-1) {
			if (array[i] > array[i-1] && array[i] > array[i+1]) {
				res++;
				i = i + 2;
			} else if (array[i] < array[i-1] && array[i] < array[i+1]) {
				res++;
				i = i +2;
			} else {
				i++;
			}
		}
		System.out.println(res+1);		
	} 
}