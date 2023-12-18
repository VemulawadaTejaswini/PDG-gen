import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] a = new long[n];
		long max = 0;
		Set<Long> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			set.add(scan.nextLong());
		}
		
		for(Long l : set){
			max += l;
		}
		
		if (max % 2 == 1) {
			System.out.println("first");
		}else{
			System.out.println("second");
		}

	}
}
