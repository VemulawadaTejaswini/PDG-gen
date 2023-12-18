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
		for(int i=0; i<N; i++){
			A.add(sc.nextLong());
		}

		Collections.sort(A);

		out: for(int i=0; i<M; i++){
			int B = sc.nextInt();
			Long C = sc.nextLong();

			Collections.sort(A);
			in : for(int j=0; j<B; j++){
				if(A.get(j) <= C){
					A.set(j, C);
				} else{
					continue out;
				}
			}
		}

		System.out.println(A.stream().reduce((a, b) -> a+b).get());


	}
}