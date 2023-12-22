import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tmp;
		int pastaMin = Integer.MAX_VALUE;
		
		for(int i = 0; i < 3; i++) {
			tmp = sc.nextInt();
			
			if(pastaMin > tmp) {
				pastaMin = tmp;
			}
		}
		
		int juiceMin = Integer.MAX_VALUE;
		
		for(int i = 0; i < 2; i++) {
			tmp = sc.nextInt();
			
			if(juiceMin > tmp) {
				juiceMin = tmp;
			}
		}
		
		System.out.println(pastaMin + juiceMin - 50);
	}
}