import java.util.*;

public class Main {
    public static void main( String args[] ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<Integer> S = new HashSet<Integer>(n);
        for(int i=0; i<n; i++) {
            S.add(in.nextInt());
        }
        int q = in.nextInt();
        int count = 0;
        for(int i = 0; i < q; i++) {
        	int input = in.nextInt();
        	if(S.contains(input)) count++;
             
        }
        System.out.println(count);
    }
}