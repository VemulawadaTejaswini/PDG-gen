import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		int count = 0;
		for(int k = 1; k < n; k++) {
			if(list.get(k)-list.get(k-1) == 0){
				count ++;
				k++;
			}
		}
		
		
	}
	
}
