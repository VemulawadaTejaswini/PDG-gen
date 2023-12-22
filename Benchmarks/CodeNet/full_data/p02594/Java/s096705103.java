import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int D = sc.nextInt();
        int X[];
		X = new int[N+1];
        int Y[];
		Y = new int[N+1];
        for (int i = 0; i < N; i++){
			 X[i] = sc.nextInt();
			 Y[i] = sc.nextInt();
        }
        int L;
        int Nstep ;
        Nstep=0;
        for (int i = 0; i < n; i++){
        L=((X[j])^2+(Y[j])^2)^(1/2);
        if (L<D+1){
        	Nstep=Nstep+1;
        }
        }
		// 出力
		System.out.println(Nstep);
	}
}
