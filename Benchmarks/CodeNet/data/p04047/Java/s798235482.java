import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] L = new int[2*N];
		for(int i = 0; i <= 2*N - 1; i++){
			L[i] = stdIn.nextInt();
		}
		for(int i = 0; i <= 2*N - 1; i++){
			for(int j = 2*N - 1; j > i; j--){
				if(L[j - 1] > L[j]){
					int num = L[j - 1];
					L[j - 1] = L[j];
					L[j] = num;
				}
			}
		}
		
		int ans = 0;
		String str = "";
		for(int i = 0; i <= 2*N - 1; i += 2){
			ans += L[i];
		}
		
		System.out.println(ans);
	}
}