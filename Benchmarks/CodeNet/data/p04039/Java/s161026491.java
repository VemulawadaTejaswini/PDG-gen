import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] N = sc.next().split("");
		int K = sc.nextInt();
		List<Integer> D = new ArrayList<>();
		for(int i = 0;i < K;i++) {
			D.add(sc.nextInt());
		}
		sc.close();
		int sum = 0;
		int[] num = new int[N.length];
		for(int i = 0;i < N.length;i++) {
			num[i] = Integer.parseInt(N[i]);
			while(D.contains(num[i])){
				num[i]++;
			}
			sum += num[i]*(Math.pow(10, N.length-i-1));
		}
		System.out.println(sum);
	}
}