import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] memo = new int[n];
		for(int i=0;i<n;i++)memo[i]=in.nextInt();
		Arrays.sort(memo);
		for(int s=0;s<n-1;s++)System.out.print(memo[s]+" ");
		System.out.println(memo[n-1]);
	}
}