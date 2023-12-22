import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			List<Double> answer = new ArrayList<>();
			
			while(true) {
				int n = sc.nextInt();
				
				if(n == 0) break;
				
				List<Integer> points = new ArrayList<>();
				int sum = 0;
				
				for(int i = 0; i < n; i++) {
					int point = sc.nextInt();
					points.add(point);
					sum += point;
				}
				
				double average = (double)sum / n;
				
				double sigmaSum = 0;
				for(int p : points) {
					sigmaSum += (p - average) * (p - average);
				}
				double variance = sigmaSum / n;
				double deviation = Math.sqrt(variance);
				
				answer.add(deviation);
			}
			
			answer.stream().forEach(e -> System.out.format("%.6f\n", e));
		}
	}
}
