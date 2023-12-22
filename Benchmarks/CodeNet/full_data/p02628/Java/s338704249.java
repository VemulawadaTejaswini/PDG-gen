import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K =sc.nextInt();
		int c=0;
		int[]k = new int[N];
		for(int i=0;i<N;i++) {
			 k[i]= sc.nextInt();
			
		}
		Arrays.sort(k);
		for(int i=0;i<K;i++) {
			c+=k[i];
		}
		System.out.println(c);
	}
}