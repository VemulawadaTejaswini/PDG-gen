
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		List<Integer> s = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			s.add(sc.nextInt());
		}
		
		sc.close();
		
		int l = s.get(0) + s.get(1);
		int r = s.get(2) + s.get(3);
		
		if (l > r) {
			System.out.println("Left");
		} else if (l == r){
			System.out.println("Balanced");
		} else {
			System.out.println("Right");
		}
		
	}

}
