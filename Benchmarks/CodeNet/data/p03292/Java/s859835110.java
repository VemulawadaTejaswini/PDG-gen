import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] task= new int[3];
		int ans=0;


		for(int i=0; i<3; i++) {
			task[i]=sc.nextInt();
		}

		Arrays.sort(task);

		for(int i=0; i<2; i++) {
			ans+=Math.abs(task[i]-task[i+1]);
		}
		System.out.println(ans);
	}
}