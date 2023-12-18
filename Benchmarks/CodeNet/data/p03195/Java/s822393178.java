import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long max = 0;
		Map<Long, Integer> set = new HashMap<>();
		for(int i = 0; i < n; i++){
			long value = scan.nextLong();
			set.putIfAbsent(value , 0);
			set.put(value, set.get(value) + 1);
		}
		
		for(Long key: set.keySet()){
			max += key + set.get(key) -1;
		}
		
		if (max % 2 == 1) {
			System.out.println("first");
		}else{
			System.out.println("second");
		}

	}
}
