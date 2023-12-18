import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		a.add(null);
		for (int i = 1; i <= N; i++) {
		    a.add(sc.nextInt());
		}
		int i = 1;
		int count = 0;
		List<Integer> zumi = new ArrayList<Integer>();
		
		while (true) {
		    i = a.get(i);
		    count++;
		    if (zumi.contains(i)){
			count = -1;
			break;
		    }
		    if (i == 2) {
			break;
		    }
		    zumi.add(i);
		}
		System.out.println(count);
	}
}
