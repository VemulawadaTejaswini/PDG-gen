import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long max = 0L;
        int Bi = 0;
        int save = 0;
        for (int i = 0; i < N; i++) {
        	if (i == N - 1) {
        		max += save;
        		break;
        	}
        	Bi = sc.nextInt();
        	if (i == 0) {
        		max += Bi;
        		save = Bi;
        	} else if (Bi < save) {
        		max += Bi;
        		save = Bi;
        	} else {
        		max += save;
        		save = Bi;
        	}
        }
        System.out.println(max);
    }
}