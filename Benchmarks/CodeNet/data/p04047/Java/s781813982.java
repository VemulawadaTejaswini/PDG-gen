import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] L = new int[2*n];
		for(int i=0;i<2*n;i++){
			L[i] = sc.nextInt();
		}
		Arrays.sort(L);
		int res = 0;
		for(int i=0;i<2*n;i+=2){
			res += L[i];
		}
		
		System.out.println(res);
	}
}
