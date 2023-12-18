import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Double>values= new ArrayList<>();
		for(int i=1;i<=N;i++) {
			values.add(sc.nextDouble());
		}
		Collections.sort(values);
		for(int j=1;j<N;j++) {
			double newvalue=(values.get(0)+values.get(1))/2.0;
			values.remove(0);
			values.remove(0);
			values.add(newvalue);
			Collections.sort(values);
		}
		System.out.println(values.get(0));
	}
}	