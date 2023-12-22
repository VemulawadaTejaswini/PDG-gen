import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> count = new ArrayList<Integer>();
		String a, b;

		Scanner input = new Scanner(System.in);
		
				while(input.hasNext()) {
					a = input.next();
					b = input.next();


					int sum = Integer.parseInt(a) + Integer.parseInt(b);
					count.add(Integer.toString(sum).length());
				}

				for(int i : count)
					System.out.println(i);

		
		}
	}
}