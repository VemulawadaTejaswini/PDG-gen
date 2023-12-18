import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < b; j++){
				array.add(a);				
			}
		}
		
		Collections.sort(array);				
		for (int i = 0; i < k; i++){
			array.remove(0);
		}
		System.out.println(array.get(0));

	}
}
