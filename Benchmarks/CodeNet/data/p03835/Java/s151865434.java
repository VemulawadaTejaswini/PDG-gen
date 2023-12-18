import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
    	int S = scan.nextInt();
        int a;
    	int b;
    	int x;
        int cnt = 0;
		int Z;
      
        for (a = 0; a <= K; x++) {
            if (S - x < K) Z = S-x;

            for (b = 0; b <= Z; b++) {
                if (S - a - b <= K) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
