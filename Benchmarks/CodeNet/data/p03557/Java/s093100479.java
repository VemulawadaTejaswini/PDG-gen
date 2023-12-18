import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();
		int answer = 0;

		for(int i = 0; i < N; i++){
			A.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			B.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			C.add(sc.nextInt());
		}

		//Collections.sort(A, Comparator.reverseOrder());
		Collections.sort(A);    // 昇順
		Collections.sort(B);
		Collections.sort(C);

		for(int b : B){
			//System.out.println(b);
			int anum = BS2(A, b);
			int cnum = BS3(C, b);
			if(anum == -1 || cnum == -1){

				continue;
			}
			//System.out.println(" " + anum + " " + cnum);
			answer += (anum+1) * (N - cnum);
		}
      
		System.out.println(answer);
	}


	// ArrayListと値を入れることで、値を検索して、その値より小さい数が何個あるかを返す
	public static int BS2(ArrayList<Integer> l, int target){
		//System.out.println(target);
		// 検索中の最小Index
		int lowid  = 0;

		// 検索中の最大Index
		int highid = l.size() - 1;

		// 戻り値の一時保存
		int ans = -1;

		// 検索中の最小indexの値が、最大indexの値以下である間は繰り返す
		while(lowid <= highid){

			// 中間Index
			int midid = (lowid + highid) / 2;

			// 中間の値を取得
			int midResult = l.get(midid);

			if(midResult == target){
				// 取得した中間値が検索値内だったら、取得した値を返す
				return midid - 1;
			}else if(midResult < target){
				// 取得した中間値の上限値が検索値より小さかった場合は、最小Indexを今回の中間Indexより大きくする
				lowid = midid + 1;
				ans = midid;
			}else{
				// 取得した中間値の上限値が検索値より大きかった場合は、最大Indexを今回の中間Indexより小さくする
				highid = midid - 1;
			}
		}

		// 検索範囲内には含まれなかった場合
		return ans;

	}

	public static int BS3(ArrayList<Integer> l, int target){
		//System.out.println(target);
		// 検索中の最小Index
		int lowid  = 0;

		// 検索中の最大Index
		int highid = l.size() - 1;

		// 戻り値の一時保存
		int ans = -1;

		// 検索中の最小indexの値が、最大indexの値以下である間は繰り返す
		while(lowid <= highid){

			// 中間Index
			int midid = (lowid + highid) / 2;

			// 中間の値を取得
			int midResult = l.get(midid);

			if(midResult == target){
				// 取得した中間値が検索値内だったら、取得した値を返す
				if(midid < l.size() - 1){
					return midid + 1;
				}else{
					return -1;
				}
			}else if(midResult < target){
				// 取得した中間値の上限値が検索値より小さかった場合は、最小Indexを今回の中間Indexより大きくする
				lowid = midid + 1;
			}else{
				// 取得した中間値の上限値が検索値より大きかった場合は、最大Indexを今回の中間Indexより小さくする
				highid = midid - 1;
				ans = midid;
			}
		}

		// 検索範囲内には含まれなかった場合
		return ans;

	}
}