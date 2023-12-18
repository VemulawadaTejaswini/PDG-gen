import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();

		int N = sc.nextInt();
		int K = sc.nextInt();

		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = 0; j < b; j++) {
				array.add(a);
			}
		}
      	Collections.sort(array);
       	Integer [] array_a = array.toArray(new Integer[array.size()]);
      
		System.out.print(array_a[K-1]);

      
	}
}
