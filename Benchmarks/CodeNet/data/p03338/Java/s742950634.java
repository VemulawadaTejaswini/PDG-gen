import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		System.out.println( solve(n, s) );
	}

    private static int solve(int N, String S) {
        int max = 0;

        for (int i = 1; i < N; i++) {
            String head = S.substring(0, i);
            String tail = S.substring(i);

            int cnt = 0;
            for (int c = 'a'; c <= 'z' ; c++) {
                if( head.indexOf(c) != -1 && tail.indexOf(c) != -1 ) {
                    cnt++;
                }
            }
            if (max < cnt) max = cnt;
        }
        return max;
    }
}
