import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] A = new int[1001], B = new int[1001];

		int a = in.nextInt();
		for(int i = 0; i < a; i++) A[i] = Integer.parseInt(in.next());

		int b = in.nextInt();
		for(int i = 0; i < b; i++) B[i] = Integer.parseInt(in.next());

		int comparate = compare(0, A, B);
		
		if(comparate == -1) {
			if(a < b)comparate = 1;
			else comparate = 0;
		}
		
		System.out.println(comparate);
		in.close();
	}

	static int compare(int idx, int[] A, int[] B) {
		if(idx == 1001)return -1;
		if(A[idx] < B[idx]) return 1;
		else if(A[idx] > B[idx]) return 0;
		else return compare(idx + 1, A, B);
	}

}

