import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int D = sc.nextInt();
        int X[];
		X = new int[N];
        int Y[];
		Y = new int[N];
        for (int i = 0; i < N; i++){
			 X[i] = sc.nextInt();
			 Y[i] = sc.nextInt();
        }
        double L;
        int Nstep ;
        Nstep=0;
        for (int j = 0; j < N; j++){
        	L=((X[j])^2+(Y[j])^2)^(0.5);
      	    if (L<=D){
        		Nstep=Nstep+1;
        	}
        }
		// 出力
		System.out.println(Nstep);
	}
}
