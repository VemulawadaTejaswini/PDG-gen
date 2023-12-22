import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sciences = new int[4];
		int[] socials = new int[2];
		int total = 0;
		for (int i = 0; i < sciences.length; i++) {
		    sciences[i] = sc.nextInt();
		    total += sciences[i];
		}
		Arrays.sort(sciences);
		for (int i = 0; i < socials.length; i++) {
		    socials[i] = sc.nextInt();
		    total += socials[i];
		}
		Arrays.sort(socials);
		System.out.println(total - sciences[0] - socials[0]);
	}
}

