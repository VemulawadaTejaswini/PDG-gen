import java.util.Scanner;

public class Main {
	static String[] SArray;
	static boolean flag = false;
	static long N = Long.MAX_VALUE;
	static long cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();


        SArray = S.split("");
        N = SArray.length;

        f(N-2);

        System.out.println(cnt);

	}

	static long f(long l) {
		if(SArray[(int) l].equals("B")&& SArray[(int) (l+1)].equals("W")) {
            SArray[(int) l]="W";
            SArray[(int) (l+1)]="B";
            flag = true;
			cnt++;
        }

		if(l == 0) {
			if(flag && 1 < N) {
				flag = false;
				N -= 1;
				f(N-1);
			}else {
				return 0;
			}
		}else {
			return f(l-1);
		}
		return 0;

	}

}