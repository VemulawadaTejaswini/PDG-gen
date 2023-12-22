import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine().split(" ")[0]);
		int[] H = new int[N];
		boolean[] checkedAsBad = new boolean[N];
		int index = 0;
		
		for (String h : sc.nextLine().split(" ")) {
			H[index++] = Integer.parseInt(h);
		}

		while (sc.hasNextLine()) {
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (H[A - 1] <= H[B - 1] && !checkedAsBad[A - 1]) {
				checkedAsBad[A - 1] = true;
				N--;
			}
			
			if (H[B - 1] <= H[A - 1] && !checkedAsBad[B - 1]) {
				checkedAsBad[B - 1] = true;
				N--;
			}
		
		}
		
		System.out.println(N);
	
	}

}