import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static int[] X = new int[4];
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		ArrayList<long[]> list = new ArrayList<>();
		for(int i=0;i<N;i++){
			String W = in.readLine();
			String[] Ws = W.split(" ");
			long[] X = new long[2];
			X[0] = Long.parseLong(Ws[0]);
			X[1] = Long.parseLong(Ws[1]);
			list.add(X);
		}
		Collections.sort(list,(v1,v2) -> {return (int)(v1[1] - v2[1]);});

		long time=0;
		for(long[] x:list){
			time+=x[0];
			if(time <=x[1]){

			}else{
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
	}

}
