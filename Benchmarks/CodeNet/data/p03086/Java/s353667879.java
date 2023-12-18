import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int ans = 0;
		for(int i = 0;i < N;i++){
			for(int j = 0;j < i + 1;j++){
				if((S.substring(j,N - i + j)).matches("[ACGT]{N-i}")){
					ans = (S.substring(j,N - i + j)).length();
				}
			}
		}
		System.out.println(ans);
	}
}