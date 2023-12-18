import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(), k = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) array[i]=sc.nextInt();
		Arrays.sort(array);
		for(int i=0;i<k;i++) array[i]=0;
		int sum=0;
		for(int i=k;i<n;i++) sum++;
		System.out.println(sum);
	}
}