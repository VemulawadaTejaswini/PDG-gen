import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		int L[] = new int[N];
		int D[] = new int[N];
		for(int i=0;i<N;i++) {
			L[i] = sc.nextInt();
		}
		D[0]=0;
		int c=0;
		for(int i=1;i<N;i++) {
			D[i] = D[i-1]+L[i-1];
			if(D[i]<=X)c++;
		}
		System.out.println(c+1);
	}
}