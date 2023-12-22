import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int nums[] = {0,1,2,3,5,7,8,9};
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			LinkedList<Integer> ket = new LinkedList<Integer>();
			while(n!=0) {
//				System.out.print(n%8 + " ");
				ket.addFirst(n%8);
				n/=8;
			}
			for(Integer i: ket ) System.out.print(nums[i]); 
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}