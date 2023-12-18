import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    int[] participant = new int[N];

    for (int i = 0; i < N; i++) {
    	participant[i] = K;
    }

    for (int i = 0; i < Q; i++) {
    	int n = Integer.parseInt(sc.next());
    	for (int j = 0; j < N; j++) {
    		if(j != n - 1) {
        		participant[j]--;
    		}
    	}
    }
    for (int i = 0; i < N; i++) {
    	if (participant[i] <= 0) {
    		System.out.println("No");
    	} else {
    		System.out.println("Yes");
    	}
    }
  }
}