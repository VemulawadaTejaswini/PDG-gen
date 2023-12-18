import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		int N = sc.nextInt();
		//String S = sc.next();
		double sum=0;
		//char buff=S.charAt(0);
		List<Double> array=new ArrayList<Double>();
		for(int i=0;i<N;i++) {
			array.add((double) sc.nextInt());
		}

		for(int i=0;i<N-1;i++) {
			Collections.sort(array);
			array.set(0,(array.get(0)+array.get(1))/2);
			array.remove(1);
		}
		System.out.println(array.get(0));
	}


	public static int sample() {
		return 1;
	}

}
