import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		int defineA= Integer.parseInt(input[0]);
		int defineB = Integer.parseInt(input[1]);
		int defineC = Integer.parseInt(input[2]);
		int result = 0;
		if(Even(A,B,C)) {
			result = -1;
		}else {
			while(true) {
				int A2 = A/2;
				int B2 = B/2;
				int C2 = C/2;
				A = B2 + C2;
				B = A2 + C2;
				C = A2 + B2;
				result++;
				if(Even(A) || Even(B) || Even(C)) {
					break;
				}else if(defineA == A && defineB == B && defineC == C) {
					result = -1;
					break;
				}
			}
		}
		System.out.println(result);
	}
	private static boolean Even(int A,int B,int C) {
		return (A % 2!=0) && (B % 2!=0) && (C % 2!=0);
	}
	private static boolean Even(int var) {
		return (var % 2!=0);
	}

}