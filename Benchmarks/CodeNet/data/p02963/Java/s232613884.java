import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long K = sc.nextLong();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		ArrayList<Long> ar = new ArrayList<Long>();
		for (long i = 0; i < n * K; i++) {
			long t = (i % n);
			
			
			long t1 = data[(int)t];
			int t3 = -1;
			for (int j = 0; j < ar.size(); j++) {
				if (ar.get(j) == t1) {
					t3 = j;
				}
			}
			if (t3 == -1) {
				ar.add(t1);

				
			} else {
				if (t3 == 0) {
					ar.clear();

				} else {
					for (int s = ar.size()-1; s >=t3; s--) {
						
						ar.remove(s);
					}
				
				}
				
			}
			
		
		}
		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i) + " ");
		}
	}
}
