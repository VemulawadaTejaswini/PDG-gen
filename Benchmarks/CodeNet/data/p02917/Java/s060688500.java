import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		Long[] B=Arrays.asList(sc.nextLine().split(" "))
				.stream().map(Long::valueOf).toArray(Long[]::new);
		long result=B[0];
		for(int i=0;i<N-2;i++) {
			result+=B[i]>B[i+1]?B[i+1]:Long.min(B[i], B[i+1]);
		}
		result+=B[N-2];
		System.out.println(result);
	}
}