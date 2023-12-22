import java.util.*;

class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer[] num = new Integer[5];
		
		for(int i = 0; i < 5; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		
		for(int a : num) {
			System.out.print(a + " ");
		}
	}
}