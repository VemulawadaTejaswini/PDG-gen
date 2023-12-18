import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=0; j<b; j++) {
				al.add(a);
			}
		}
		
		Collections.sort(al);
		
		System.out.println(al.get(k-1));
		
		
		sc.close();

	}

}