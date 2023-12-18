import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		int[] suretu = new int[seisu];
		int[] newretu = new int[seisu];
		int max = 0;
		int min = 1;
		int count = 0;

		for(int i=0;i<seisu;i++) {
			suretu[i]  = scan.nextInt();
			newretu[i] = suretu[i];
		}

		for(int i=0;i<seisu;i++) {
			max = Math.max(max, suretu[i]);
			min = Math.min(min, suretu[i]);
		}

		max = min;
		min = max;

		Arrays.sort(newretu);

		for(int i=0;i<seisu;i++) {
			if(suretu[i] == newretu[i]) {
				count++;
			}
		}
		System.out.println(count == newretu.length?"YES":"NO");
		scan.close();

	}

}
