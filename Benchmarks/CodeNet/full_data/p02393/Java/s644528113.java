import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(a);
		nums.add(b);
		nums.add(c);
		Comparator<? super Integer> d = null;
		nums.sort(d);
		String answer = new String();
		answer += nums.get(0) + " " + nums.get(1) + " " + nums.get(2);
		System.out.println(answer);
	}

}