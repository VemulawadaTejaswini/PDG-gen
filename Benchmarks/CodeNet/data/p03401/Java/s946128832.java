import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> aArrayList = new ArrayList<>();
		for (int i=0; i<n; i++){
			aArrayList.add(Integer.parseInt(sc.next()));
		}

		int sum = 0;

		sum += Math.abs(aArrayList.get(0));
		for (int i=0; i<n-1; i++){
			sum += Math.abs(aArrayList.get(i) - aArrayList.get(i+1));
		}
		sum += Math.abs(aArrayList.get(aArrayList.size()-1));

		System.out.println(sum - Math.abs(aArrayList.get(0)) - Math.abs(aArrayList.get(0) - aArrayList.get(1)) + Math.abs(aArrayList.get(1)));
		for (int i=1; i<n-1; i++){
			System.out.println(sum - Math.abs(aArrayList.get(i) - aArrayList.get(i-1)) - Math.abs(aArrayList.get(i) - aArrayList.get(i+1)) + Math.abs(aArrayList.get(i-1) - aArrayList.get(i+1)));
		}
		System.out.println(sum - Math.abs(aArrayList.get(n-1)) - Math.abs(aArrayList.get(n-2) - aArrayList.get(n-1)) + Math.abs(aArrayList.get(n-2)));

	}
}
