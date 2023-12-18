import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < a.length; i ++) {
			a[i] = sc.nextInt();
		}
		
		int count = 1;
		for(int i = 0; i < a.length; i++) {
			if(a[i]==count) {
				count++;
				b[i] = i++;
				System.out.print(b[i]);
			}
		}
		
		
	}

}
