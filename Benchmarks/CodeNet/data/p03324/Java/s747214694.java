import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer D = sc.nextInt();
		Integer N = sc.nextInt();

		List<Integer> ansList = new ArrayList<>();
		if (D == 0) {
			for(int i=1; i<=100; i++) {
				ansList.add(i);
			}
		} else if (D == 1) {
			for(int i=1; i<=100; i++) {
				ansList.add(i * 100);
			}
		} else {
			for(int i=1; i<=100; i++) {
				ansList.add(i * 10000);
			}
		}

		System.out.println(ansList.get(N-1));


	}

}

