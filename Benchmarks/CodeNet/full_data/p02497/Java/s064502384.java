import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, f, r;
		
		List<String> rank = new ArrayList<>(); 
		
		while(true) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			
			if(m == -1 && f == -1 && r == -1) {
				break;
			} else if(m == -1 || f == -1) {
				rank.add("F");
			} else if(m + f >= 80) {
				rank.add("A");
			} else if(m + f >= 65) {
				rank.add("B");
			} else if(m + f >= 50) {
				rank.add("C");
			} else if(m + f >= 30) {
				if(r >= 50) {
					rank.add("C");
				} else {
					rank.add("D");
				}
			} else if(m + f < 30) {
				rank.add("F");
			}
		}
		
		for(int i = 0; i < rank.size(); i++) {
			System.out.println(rank.get(i));
		}
	}
}