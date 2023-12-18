import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		Map<Restaulant, Integer> map = new TreeMap<>();

		for (int i = 0; i < cnt; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			map.put(new Restaulant(name, -score), i + 1);
		}
		map.entrySet().stream().forEachOrdered(e -> System.out.println(e.getValue()));		
	}
}

class Restaulant implements Comparable<Restaulant>{
	String city;
	int score;

	public Restaulant(String city,int score) {
		super();
		this.score = score;
		this.city = city;
	}

	@Override
	public int compareTo(Restaulant arg0) {
		int ret = this.getCity().compareTo(arg0.getCity());
		if (ret == 0) {
			if (this.getScore() < arg0.getScore()) return -1;
			else return 1;
		}
		return ret;
	}

	public int getScore() {
		return score;
	}

	public String getCity() {
		return city;
	}
}
