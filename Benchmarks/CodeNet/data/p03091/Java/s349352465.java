import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] count = new int[n];
		for(int i=0; i<m; i++) {
			count[sc.nextInt()-1]++;
			count[sc.nextInt()-1]++;
		}
		
		boolean even = true;
		boolean six = false;
		int branch = 0;
		for(int i=0; i<n; i++) {
			even &= ((count[i]%2)==0);
			six |= count[i] >= 6;
			branch += count[i]-2;
		}

		out.println(even && (six || branch >= 6) ? "Yes": "No");
    }
}
