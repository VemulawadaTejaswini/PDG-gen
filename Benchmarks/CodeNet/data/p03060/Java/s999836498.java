import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n= sc.nextInt();
		ArrayList<Integer> v = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {

			v.add(sc.nextInt());
		}
		ArrayList<Integer> c = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			c.add(sc.nextInt());
		}
		int sum=0;
		int plus=0;
		for(int i=0;i<n;i++) {
			plus = v.get(i)-c.get(i);
			if(plus>0) {
				sum+=plus;
			}
		}
		System.out.println(sum);
	}
}
