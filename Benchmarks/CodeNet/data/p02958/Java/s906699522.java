import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ps = new int[N];
		int invalids = 0;
        int[] ivs = new int[N];
		for (int i = 0; i < N; i++) {
			ps[i] = sc.nextInt();
			if (i > 0) {
				if (ps[i] < ps[i - 1]) {
					ivs[invalids++] = i;
				}
			}
		}
		if (invalids <= 1) {    	
			System.out.println(invalids <= 2 ? "YES" : "NO");
        } else if (invalids == 2) {
          int tmp = ps[ivs[0]];
          ps[ivs[0]] = ps[ivs[1]];
          ps[ivs[1]] = tmp;
     	  for (int i = 1; i < N; i++) {
            if (ps[i] < ivs[i - 1]) {
              System.out.println("NO");
              return;
            }
          }
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
	}
}
