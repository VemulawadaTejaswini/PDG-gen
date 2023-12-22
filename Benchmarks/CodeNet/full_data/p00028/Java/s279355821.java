import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ints = new int[101];
		int max = Integer.MAX_VALUE;
		while (sc.hasNext()) {
			int temp = sc.nextInt();
			ints[temp]++;
			max = Math.max(max,ints[temp]);
		}
		for (int i=1; i<101; i++) {
			if (ints[i]==max) {System.out.println(i);}
		}
	}
}			
