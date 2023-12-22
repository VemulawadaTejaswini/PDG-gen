import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		
		Collections.sort(al);
		Collections.reverse(al);
		
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				System.out.print(al.get(i));
			} else {
				System.out.print(al.get(i) + " ");
			}
		}
		
		System.out.println();
	}
}