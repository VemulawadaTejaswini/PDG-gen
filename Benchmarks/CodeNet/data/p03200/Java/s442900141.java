import java.util.Scanner;

public class Main {
	static char[] cArray;
	static int N;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        N = S.length();
        cArray = S.toCharArray();

        long w = 0;
        long cnt = 0;
        for(int i = N-1; i>=0; i--) {
            if(cArray[i] == 'W') w++;
            if(cArray[i] == 'B') cnt = cnt + w;
        }

        System.out.println(cnt);
        sc.close();

	}

}