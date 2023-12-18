import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		int N = Integer.parseInt(br.readLine());

		// 1行、複数文字、Listに格納
		List<String> a = Arrays.asList( br.readLine().trim().split(" ", 0) );
		List<String> b = new ArrayList<String>();
		List<String> c = new ArrayList<String>();


		for(int i=N-1; i>=0; i -= 2){
			b.add(a.get(i));
		}
		int j;
		if (N%2==0) { j=0; } else { j=1; }
		for(int i=j; i<N; i += 2){
			b.add(a.get(i));
		}


		StringBuilder sb = new StringBuilder();
		for(String s: b) {
			sb.append(s);
			sb.append(" ");
		}
		sb.delete(sb.length()-1, sb.length());  // 消去：早い

//		System.out.println("[" + sb + "]");
		System.out.println(sb);
	return;
	}
	// 入力値確認：リスト
	static void checkInput(List l) { System.out.println(l); }

}
