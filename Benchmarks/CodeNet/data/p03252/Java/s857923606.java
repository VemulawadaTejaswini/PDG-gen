import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Main st = new Main();
		if(st.String_Transformation()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public boolean String_Transformation() throws IOException{
		/**
		 * <条件>
		 * 文字の種類数が一緒　かつ　同じ文字が同数個ある場合、それを消去したうえで、同数回現れる文字が同数個ある
		 *
		 */
		//入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2= br.readLine();

		String[] s = new String[s1.length()];
		String[] t = new String[s2.length()];
		for(int i = 0; i < s1.length(); i++) {
			s[i] = String.valueOf(s1.charAt(i));
			t[i] = String.valueOf(s2.charAt(i));
		}


		HashMap<String, Integer> d1 = new HashMap<>();
		HashMap<String, Integer> d2 = new HashMap<>();
		/*それぞれの文字種類数を比較 */
		for(int i = 0; i < s.length; i++) {
			int v;
		    if (d1.containsKey(s[i])) {
		        v = d1.get(s[i]) + 1;
		    } else {
		        v = 1;
		    }
		    d1.put(s[i], v);

		    v = 0;
		    if (d2.containsKey(t[i])) {
		        v = d2.get(t[i]) + 1;
		    } else {
		        v = 1;
		    }
		    d2.put(t[i], v);
		}

		/*同じ文字が同数個ある場合消去していく */
		for(String a:s) {
			if(d2.containsKey(a) && (d1.get(a) != d2.get(a))) {
				return false;
			}
		}

		HashMap<Integer, Integer> m1 = new HashMap<>();
		HashMap<Integer, Integer> m2 = new HashMap<>();

		if(d1.size() == d2.size()) {

			/* 同数個現れた文字の数が一致するかを比較 */
			for(int j = 0; j < d1.size(); j++) {
				int key1 = d1.get(s[j]);
				int key2 = d2.get(t[j]);
				int v;
			    if (m1.containsKey(key1)) {
			        // Mapに登録済み
			        v = m1.get(key1) + 1;
			    } else {
			        // Mapに未登録
			        v = 1;
			    }
			    m1.put(key1, v);

			    v = 0;
			    if (m2.containsKey(key2)) {
			        v = m2.get(key2) + 1;
			    } else {
			        v = 1;
			    }
			    m2.put(key2, v);
			}

			if(m1.size() == m2.size()) {
				for(int h = 0; h < m1.size(); h++) {
					if(Objects.equals(m1.get(h),m2.get(h))) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
