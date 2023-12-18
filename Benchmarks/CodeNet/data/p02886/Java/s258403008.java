import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList<>();
		
		int sum = 0;
		
		int takoyaki = sc.nextInt();
		
		for(int i = 1; i <= takoyaki; i++) {
			int delicious = sc.nextInt();
			list.add(delicious);
		}
		
		for(int i : list) {
			for(int j : list) {
				if( i == j) {
					continue;
				}else {
					int one = list.get(i);
					int two = list.get(j);
					sum += one * two;
				}
			}
		}
	}
}
