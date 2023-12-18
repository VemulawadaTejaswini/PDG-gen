
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int x;
		int y;
		int z;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
//		String num = scan.nextLine();
//		String[] numbers = num.split(" ");
//		x = Integer.parseInt(numbers[0]);
//		y = Integer.parseInt(numbers[1]);
//		z = Integer.parseInt(numbers[2]);
		Scanner sca = new Scanner(System.in);
		String A = sca.nextLine();
//		System.out.println(A);
		String[] a = A.split(" ");
		ArrayList<Integer> number = new ArrayList<>();
		for(int i = 0; i<a.length+1; i++) {
			number.add(0);
		}
//		int[] num =  new int[a.length+1];
		for(int i = 0; i<a.length; i++) {
			number.set(Integer.parseInt(a[i])-1,number.get(Integer.parseInt(a[i])-1)+1);
		}

		for(int ans : number) {
			System.out.println(ans);
		}
	}
}