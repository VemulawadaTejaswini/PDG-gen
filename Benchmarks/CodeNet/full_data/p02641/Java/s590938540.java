import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		Integer[] l = new Integer[n];
		int ans1 =x;
		int ans2 =x;
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		
			if(Arrays.asList(l).contains(x)) {
				ans1--;
				ans2++;
			}
			
		while(true) {
			if(Arrays.asList(l).contains(ans1)) {
				ans1--;
			} else {
				break;
			}
		}
			
		while(true) {
			if(Arrays.asList(l).contains(ans2)) {
				ans2++;
			} else {
				break;
			}
		}
			
			
		
		int a1 = Math.abs(x-ans1);
		int a2 = Math.abs(x-ans2);
		
		if(a1 == a2) {
			System.out.println(ans1);
		} else if(a1 > a2) {
			System.out.println(ans2);
		} else {
			System.out.println(ans1);
		}

		//String s = sc.next();
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
