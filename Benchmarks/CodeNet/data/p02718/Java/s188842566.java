import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();;
		int total = 0;
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			a.add(v);
			total += v;
		}
		Collections.sort(a, Collections.reverseOrder());
		int v=a.get(m-1);
		if(v*4*m>=total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
