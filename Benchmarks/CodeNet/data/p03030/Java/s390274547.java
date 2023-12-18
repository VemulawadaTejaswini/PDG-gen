import java.time.Instant;
import java.util.*;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Pair<String, Integer>> SP = new ArrayList<>();
		for(int i=0; i<N; i++){
			SP.add(new Pair<String, Integer>(i+1, sc.next(),sc.nextInt()));
		}

		Comparator<Pair> comparator = Comparator.<Pair, String> comparing(pair -> (String)pair.a)
		        .<Integer>thenComparing(pair -> -1 * (int)pair.b);

		SP = SP.stream().sorted(comparator).collect(Collectors.toList());

		for(Pair pair : SP){
			System.out.println(pair.n);
		}






	}

	static class Pair<T1, T2>   {
		int n;
	    T1 a;
	    T2 b;
	    public Pair(int n, T1 a,T2 b) {
	        this.n = n;
	    	this.a = a;
	        this.b = b;
	    }

	    T1 getA(){
	    	return a;
	    }

	    T2 getB(){
	    	return b;
	    }

	}
}


