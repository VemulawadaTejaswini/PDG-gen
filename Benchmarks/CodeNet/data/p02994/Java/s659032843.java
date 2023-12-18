import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int L = sc.nextInt();
		int taste = 0;
		int min=Integer.MAX_VALUE;
		int minabs=Integer.MAX_VALUE;
		for(int i=1;i<=N;i++) {
			taste += L+i-1;
			if(minabs> Math.abs(L+i-1)) {
				minabs = Math.abs(L+i-1);
				min = L+i-1;
			}
		}
		taste-=min;
		System.out.println(taste);
	}
}