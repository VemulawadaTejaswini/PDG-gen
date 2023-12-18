import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		List<Integer> C = new ArrayList<>();
		
		for (int i = 0; i < N; i++) A.add(sc.nextInt());
		for (int i = 0; i < N; i++) B.add(sc.nextInt());
		for (int i = 0; i < N; i++) C.add(sc.nextInt());
		
		int c = 0;
		for (int b : B) {
			int i, j;
			for (i = 0; i < A.size() && A.get(i) < b; i++);
			for (j = C.size() - 1; j >= 0 && C.get(j) > b; j--);
			
			c += i * C.size() - j - 1;
		}
		System.out.println(c);
		
		
		/*
		int key = sc.nextInt();
		
		int n[] = new int[100];
		for (int i = 0; i < 100; i++) {
			n[i] = i;
		}
		
		int min = 0;
		int max = n.length - 1;
		int middle = 0;
		while (min < max) {
			middle = min + (max - min) / 2;
			if (n[middle] <= key) {
				min = middle + 1;
			} else if (n[middle] > key) {
				max = middle;
			}
		}
		middle++;
		*/
	}
}