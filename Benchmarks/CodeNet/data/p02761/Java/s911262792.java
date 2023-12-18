import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int s,c;
	int[] kazu = new int[n];
	boolean[] is = new boolean[n];
	boolean can = true;
	for (int i=0; i<m; i++) {
	    s = sc.nextInt() - 1;
	    c = sc.nextInt();
	    if (s == 0 && c == 0) {
		can = false;
		break;
	    }
	    if (is[s] == false) {
		kazu[s] = c;
		is[s] = true;
	    } else {
		if (kazu[s] != c) {
		    can = false;
		    break;
		}
	    }
	    
	}
	if (can == false) {
	    System.out.print(-1);
	} else {
	    if (kazu[0] == 0) {
		System.out.print(1);
	    } else {
		System.out.print(kazu[0]);
	    }
	    for (int i=1; i<n; i++) {
		System.out.print(kazu[i]);
	    }
	}
    }
}
