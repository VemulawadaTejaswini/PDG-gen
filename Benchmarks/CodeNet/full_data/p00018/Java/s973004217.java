import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		for(int i=0;i<5;i++){
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		for(int i=0;i<5;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(n[4-i]);
		}
		System.out.println();
	}
}