
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int[] a = new int[N];

	for (int i = 0; i < N; i++) {
	    a[i] = Integer.parseInt(scan.next());
	}

	boolean[] reach = new boolean[N];
	reach[0] = true;

	int ans = -1;
	for (int i = 1; i < N; i++) {
	    boolean[] newReach = new boolean[N];
	    for (int j = 0; j < N; j++) {
		newReach[j] = reach[j];
	    }
	    
	    for (int j = 0; j < N; j++) {
		if(reach[j])
		    newReach[a[j]-1] = true;
	    }

	    reach = newReach;
	    if(reach[1] == true) {
		ans = i;
		break;
	    }
	}

	System.out.println(ans);
	scan.close();
    }
}
