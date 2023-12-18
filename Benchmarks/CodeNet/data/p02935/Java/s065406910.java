import java.util.*;

	//多分ソートする問題

public class Main {

	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		double[] v= new double[N];
		double ans=0;

		for(int i=0;i<N;i++){
			v[i] = sc.nextDouble();
		}

		//ここでｖの中身を昇順にソート

		Arrays.sort(v);

		//答えを求める

		ans = v[0];
		for(int j=1;j<N;j++){
			ans=(ans+v[j])/2;
		}

		System.out.println(ans);
	}

}
