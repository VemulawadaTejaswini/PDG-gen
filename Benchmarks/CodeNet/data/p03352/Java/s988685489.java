import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		List<Double> expList = new ArrayList<>();

		for (int i=1; i<=Math.sqrt(X); i++) {
			for (int j=2; j<10; j++) {
				if (Math.pow(i, j)<=X) {
					expList.add(Math.pow(i, j));
				}
			}
		}

		Collections.sort(expList);
		System.out.println(expList.get(expList.size()-1));
	}
}

