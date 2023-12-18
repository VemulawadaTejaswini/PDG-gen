import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //
		int X = Integer.parseInt(br.readLine());
		int t = 0;
		int i = 0;
		
		
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(0));
		List<Integer> l2 = new ArrayList<Integer>();
		
		while (true) {
			t++;
			l2.clear();
			for(int x: l) {
				i = x-t;
				if(i>0){
					if (i == X) { System.out.println(t); return; }
					l2.add(i);
				}
				i = x;
					if (i == X) { System.out.println(t); return; }
					l2.add(i);
				l2.add(x);
				i = x+t;
					if (i == X) { System.out.println(t); return; }
					l2.add(i);
			}
			//重複削除
			l2.stream().distinct().collect(Collectors.toList());
			//調査
//			for(int x: l2) {
//				if (x == X) { System.out.println(t); return; }
//			}
			//次回用初期化
			l.clear();
			l.addAll(l2);
		}


        //System.out.println(t);
        //return;
    }
    //-----------------------------------------------------------------
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }


	//-----------------------------------------------------------------
	// 入力値確認：リスト
	static void checkInput(List l) { System.out.println(l); }
	//-----------------------------------------------------------------
	// 入力値確認：配列、二次元、int型
	static void checkInput(int[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(int[] i1: i2){
			for(int i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}

}