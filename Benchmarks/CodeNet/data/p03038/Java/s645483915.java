import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Long> A = new ArrayList<>();
		List<Long> D = new ArrayList<>();
		for(int i=0; i<N; i++){
			A.add(sc.nextLong());
		}

		Collections.sort(A);

		for(int i=0; i<M; i++){
			int B = sc.nextInt();
			Long C = sc.nextLong();
			for(int j=0; j<B; j++){
				D.add(C);
			}
		}

		Collections.sort(D, Comparator.reverseOrder());

		if(D.size()>N){
			D = D.subList(0, N);
		}


		 for(int i=0; i<N; i++){
			 if(A.get(i)<D.get(i)){
				 A.set(i, D.get(i));
			 }else{
				 break;
			 }
		 }

		System.out.println(A.stream().reduce((a, b) -> a+b).get());


	}
}