import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String s= scanner.next();

		int[] leftside = new int[N];
		int[] rightside = new int[N];

		leftside[0]=0;
		rightside[N-1]=0;
		for(int i=1;i<N;i++) {
			leftside[i]=(s.charAt(i-1)=='W')?leftside[i-1]+1:leftside[i-1];
			rightside[N-1-i]=(s.charAt(N-1-i+1)=='E')?rightside[N-1-i+1]+1:rightside[N-1-i+1];
		}

		int min = N+1;
		int wk;
		for(int i = 0;i < N;i++) {
			wk = leftside[i]+rightside[i];
			min=(min>wk)?wk:min;
		}

		System.out.println(min);

	}

}
