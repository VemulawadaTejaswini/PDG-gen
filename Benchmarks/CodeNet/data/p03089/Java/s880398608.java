import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> b = new ArrayList<>();
		int[] a = new int[n];
		a[0] = 1;
		boolean able = true;
		for(int i = 0; i < n; i++) {
			b.add(sc.nextInt());
			if(b.get(i) > i + 1) able = false;
		}
		if(!able) System.out.println(-1);
		else {
			for(int i = n-1; i >= 0; i--) {
				for(int j = b.size()-1; j >= 0; j--) {
					if(b.get(j) == j + 1) {
						a[i] = b.get(j);
						b.remove(j);
						break;
					}
				}
			}
			for(int i = 0; i < n; i++)
				System.out.println(a[i]);
		}
	}

}