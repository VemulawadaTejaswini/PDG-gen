import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	while (true) {
	    int n = in.nextInt();
	    int x = in.nextInt();

	    if (n == 0 && x == 0) {
		break;
	    }

	    System.out.println(solve(n,x));
	}
    }

    public static int solve (int n,int x) {
	int res = 0;

	for (int i = 1 ; i <= n-2 ; i++) {
	    for (int j = i + 1 ; j <= n-1 ; j++) {
		for (int k = j + 1 ; k <= n ; k++) {
		    if (i + j + k == x) {
			res++;
		    }
		}
	    }
	}


	return res;
    }
}