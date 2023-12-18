import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> d = new ArrayList<>();
		for(int i=0; i<n; i++) {
			d.add(sc.nextInt());
		}
		Collections.sort(d);
		int m1 = d.get(d.size()/2);
		int m2 = d.get(d.size()/2-1);
		System.out.println(m1-m2);
		sc.close();
	}
}
