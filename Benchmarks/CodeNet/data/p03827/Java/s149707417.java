import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String N0 = scan.next();
		String S = scan.next();
		int N = Integer.parseInt(N0);
		int x = 0;

		char[] moji = new char[N];// 判定前配列
		int[] value = new int[N];// 判定後配列

		for (int i = 0; i < N - 1 ; i++) {
			
			moji[i] = S.charAt(i);
			if (moji[i] == 'I') {
				x++;
				value[i] = x;
			} else if (moji[i] == 'D') {
				x--;
				value[i] = x;
			}

		}
		//System.out.println(Arrays.toString(value));
		
		
		int max = value[0];
		for (int a = 1; a < value.length; a++) {
			int v = value[a];
			if (v > max) {
				max = v;
			}
	
		}
		
		if(max< 0){
			System.out.println(0);		
		} else {
			System.out.println(max);		
		}



		
	}
}
