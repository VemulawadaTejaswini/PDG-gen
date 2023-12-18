import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(); //問題数を決定
		int []time = new int[N]; //各問題にかかる時間を格納
		int T=0;
		for(int i=0;i<N;i++){//所要時間決定
			T = T + (time[i] = sc.nextInt());//ドリンクなしの場合の合計時間
		}
		
		int M=sc.nextInt();//ドリンクの数を決定
		
		int sumtime = 0; 
		for(int i=0;i<M;i++){
			sumtime = T - (time[sc.nextInt()-1] - sc.nextInt()); //要素０も参照できるようにする
			System.out.println(sumtime);
		}
	}
}
