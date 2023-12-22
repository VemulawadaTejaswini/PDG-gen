import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Stack;

// ALDS1_3_D
public class Main {
	void run() throws IOException {
		Stack<Integer> st = new Stack<Integer>();
		ArrayDeque<Integer> area = new ArrayDeque<Integer>();
		ArrayList<Integer> height = new ArrayList<Integer>();
		int A = 0; int k = 0; int L = 0; int h = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		int len = str.length;
		// /の高さを格納
		for (int i = 0; i < len; i++) {
			switch(str[i]) {
			case "\\":
				h--;
				height.add(null);
				break;
			case "/":
				height.add(h);
				h++;
				break;
			default:
				height.add(null);
				break;
			}
		}
		h = 0;
		// \を格納する際に，それ以降に対応する/がない場合は格納しない処理をとる
		for (int i = 0; i < len; i++) {
			switch(str[i]) {
			case "\\":
				h--;
				if (height.subList(i, height.size()).contains(h)) st.push(i);
				break;
			case "/":
				if (!st.empty()) {
					int l = i - st.pop();
					A = A + l;
					L = L + l;
					if (st.empty()) {
						area.addLast(L);
						k += 1;
						L = 0;
					}
				}
				h++;
				break;
			case "_":
				if (i == len) 
				break;
			default:
				break;
			}
		}
		System.out.println(A);
		System.out.print(k);
		for (Integer n : area) {
			System.out.print(" " + n);
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
