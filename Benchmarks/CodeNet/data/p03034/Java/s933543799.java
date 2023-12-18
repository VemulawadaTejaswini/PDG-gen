
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        ArrayList<Integer> s = new ArrayList<>();
        for(int i=0; i<N; i++) {
        	s.add(sc.nextInt());
        }

        long score = 0;
        for(int c=1; c<=N-1; c++) {
        	long tmp = 0;
        	Set<Integer> t = new HashSet<Integer>();
        	for(int k=0; k*c<=N-1; k++) {

        		if(t.contains(k*c)) break;
        		tmp += s.get(k*c);
        		t.add(k*c);

        		if(t.contains((N-1)-k*c)) break;
        		tmp += s.get((N-1)-k*c);
        		t.add((N-1)-k*c);

            	score = Math.max(score, tmp);
        	}
        }
        System.out.println(score);
        sc.close();

    }

}
