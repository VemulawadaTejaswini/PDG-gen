import java.util.Scanner;

public class Main {
	static long p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if((x + y) % 3 != 0) {
			System.out.println(0);
			return;
		}

		p = new long[x/2+1][y/2+1];
		p[0][0] = 1;





		System.out.println(re(x/2,y/2) % 1000000007);

        return;
    }

	public static long re(int i, int j) {

		if(p[i][j]!=0) {
			return p[i][j];
		}else {
			return re(i-1,j) + re(i,j-1);
		}
	}
}

