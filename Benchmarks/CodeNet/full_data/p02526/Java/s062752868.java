import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int counter = 0;
		int n = sc.nextInt();
		ArrayList<Integer> s = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++){
			s.add(sc.nextInt());
		}
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++){
			if(s.contains(sc.nextInt())){
				counter++;
			}
		}
		System.out.println(counter);
	}
}