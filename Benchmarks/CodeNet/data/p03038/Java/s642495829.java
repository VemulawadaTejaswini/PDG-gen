import java.time.Instant;
import java.util.*;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Long> A = new ArrayList<>();
		List<Pair<Integer, Long>> BC = new ArrayList<>();
		List<Long> D = new ArrayList<>();
		for(int i=0; i<N; i++){
			A.add(sc.nextLong());
		}

		Collections.sort(A);

		for(int i=0; i<M; i++){
			int B = sc.nextInt();
			Long C = sc.nextLong();
			BC.add(new Pair<Integer, Long>(B, C));
		}


		Comparator<Pair<Integer, Long>> comp = Comparator.comparingLong(new ToLongFunction<Pair<Integer, Long>>() {
	        @Override
	        public long applyAsLong(Pair<Integer, Long> pair) {
	            return pair.b;
	        }
	    });

		BC.stream().sorted(comp).collect(Collectors.toList());

		out : for(Pair<Integer, Long> pair : BC){
			for(int i=0; i< pair.a; i++ ){
				D.add(pair.b);
				if(D.size()>N){
					break out;
				}
			}
		}


		 for(int i=0; i<N && i<D.size(); i++){
			 if(A.get(i)<D.get(i)){
				 A.set(i, D.get(i));
			 }else{
				 break;
			 }
		 }

		System.out.println(A.stream().reduce((a, b) -> a+b).get());


	}

	static class Pair<T1, T2> {
	    T1 a;
	    T2 b;
	    public Pair(T1 a,T2 b) {
	        this.a = a;
	        this.b = b;
	    }
	}
}


