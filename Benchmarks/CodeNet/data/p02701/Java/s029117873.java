import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		HashSet<String> S = new HashSet<String>();
        for(int i=0; i<N; i++) {
        	S.add(sc.next());
        }
        System.out.println(S.size());
    }
}