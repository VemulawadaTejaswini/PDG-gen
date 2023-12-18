import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long tab[] = new long[n];
		for(int i = 0 ; i < n;i++) {
			tab[i] = sc.nextLong();
		}
		Arrays.sort(tab);
		int i = 0;
		long somme =0;
		while(i < n) {
			somme+=tab[tab.length-1-i];
			i+=2;
		}
		System.out.println(somme);
	}

}