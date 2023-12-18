import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] as = new int[n];
		int count4 = 0;
		int countOdd = 0;
		
		for(int i=0; i<as.length; i++) {
			as[i] = sc.nextInt();
			if(as[i]%4 == 0) {
				count4 += 1;
			}else if(as[i]%2 != 0) {
				countOdd += 1;
			}
		}
		sc.close();
		
		if(count4 >= countOdd) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
