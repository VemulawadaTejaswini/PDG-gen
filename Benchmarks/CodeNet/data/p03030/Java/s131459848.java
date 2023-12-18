import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String[] S = new String[(int)(N)];
        long[] P = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                S[i] = sc.next();
                P[i] = sc.nextLong();
        }
        solve(N, S, P);
    }

    static void solve(long N, String[] S, long[] P){
	List<R> list = new ArrayList<>();
	for(int i = 0; i < (int)N; i++) {
	    list.add(new R(i + 1, S[i], P[i]));
	}
	list.stream()
	    .sorted((r1, r2) -> r1.name.equals(r2.name) ? r1.point - r2.point < 0 ? 1 : -1 : r1.name.compareTo(r2.name))
	    .map(R::getId)
	    .forEach(System.out::println);
    }
}

class R {
    int id;
    String name;
    long point;

    public R(int id, String name, long point) {
	this.id = id;
	this.name = name;
	this.point = point;
    }

    public int getId() {
	return this.id;
    }
}
