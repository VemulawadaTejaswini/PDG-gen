import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String C = sc.next();
		int RCount[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			int r = C.charAt(i) == 'R' ? 1 : 0;
			RCount[i] = r;
			if(i > 0){
				RCount[i] += RCount[i - 1];
			}
		}
		int ret = RCount[N - 1]; // 全てWにする場合
		ret = Math.min(ret, N - RCount[N - 1]); // 全てRにする場合		
		// RRRR...WWW
		for(int i = 0 ; i < N - 1; ++i){
			int leftR = RCount[i];
			int leftW = (i + 1) - leftR;
			int rightR = RCount[N - 1] - RCount[i];
			int rightW = (N - i - 1) - rightR;
			int swap = Math.min(leftW, rightR);
			leftW -= swap;
			rightR -= swap;
			int op = leftW + rightR + swap;
//			System.out.println(leftR+" "+leftW+" "+rightR+" "+rightW+" "+swap+ " " + op);
			ret = Math.min(ret, op);
		}
		System.out.println(ret);
	}
}
