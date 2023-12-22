import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) a[i] = in.nextInt();
		
		for(int i=0;i<a.length-1;i++) System.out.print(a[i]+" ");
		System.out.println(a[a.length-1]);
	}

}