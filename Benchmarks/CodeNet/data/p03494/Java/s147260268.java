import java.util.*;

public class Main {

	public static void main(String[] args){
		
		List<Integer> numList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		while(sc.hasNext()) {
			int num = sc.nextInt();
			numList.add(num);
		}
		
		int count = 0;
		int mul = 1;
		LOOP: {
			while(true) {
				for(int i=0; i<numList.size(); i++) {
					int num = numList.get(i);
					if(num % 2 == 0) {
						numList.set(i, num / 2);
					} else {
						break LOOP;
					}
				}
				count++;
			}
		}
		
		System.out.println(count);
	}

}