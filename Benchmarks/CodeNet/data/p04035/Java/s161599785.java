import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int l = console.nextInt();
		console.nextLine();
		int[] lengths = new int[n];
		for(int i = 0; i < n; i++)
			lengths[i] = console.nextInt();
		
		int finalKnot = -1;
		for(int i = 0; i < n-1; i++) {
			if(lengths[i] + lengths[i+1] >= l) {
				finalKnot = i;
				break;
			}
		}
		if(finalKnot != -1) {
			System.out.println("Possible");
			for(int i = 0; i < finalKnot; i++)
				System.out.println(i+1);
			for(int i = n-1; i > finalKnot; i--)
				System.out.println(i);
		}
		else
			System.out.println("Impossible");
		
	}

}