import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (M > N) {
			System.out.println("No");
			return;
		}
		String[] A = new String[N];
		String[] B = new String[M];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLine();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextLine();
		}
		boolean b = false;
		int i2 = 0;
		int i3 = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= A[i].length() - B[0].length(); j++){
			String s = A[i].substring(j, B[0].length() + j);
			if(s.equals(B[0])){
				b = true;
				i2 = i;
				i3 = j;
				break;
			}
		}
		}
		if(b == false || N - i2 < M){
			System.out.println("No");
			return;
		}
		int i4 = 1;
		int c = 1;
		while(true){
			String s2 = A[i2].substring(i3,B[i4].length());
			if(s2.equals(B[i4])){
				c++;
				if(c == M){
					break;
				}
			}else{
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}