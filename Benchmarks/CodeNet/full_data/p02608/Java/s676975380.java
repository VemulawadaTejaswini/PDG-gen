import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int ans = 0;
		for (int i = 1; i < 6; ++i) {
			System.out.println(0);
		}
		int xyz = 0;
		int t;
		for (int i = 6; i <= N; ++i) {
			ans = 0;
			for (int x = 1; x * x < N; ++x) {
				for (int y = 1; x*x+y*y+x*y < N; ++y) {
					for (int z = 1; x*x+y*y+z*z+x*y+x*z < N; ++z) {
						xyz = (x + y + z) * (x + y + z) - (x * y + y * z + z * x);
						if (xyz == i) {
							ans++;
							//System.out.println(" ["+i+"]"+x+","+y+","+z);
						}
					}
				}
			}
			//System.out.println("["+i+"]"+ans);
			System.out.println(ans);
		}
	}
}
