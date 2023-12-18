
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] n_array = new String[n];
		for(int i = 0; i < n; i++) {
			n_array[i] = sc.next();
		}

		String[] m_array = new String[m];
		for(int i = 0; i < m; i++) {
			m_array[i] = sc.next();
		}

		boolean papapa = false;
		for(int i = 0; i < n; i++) { //Aの全行に対して
			if(n_array[i].contains(m_array[0])) { //Bの1行目の文字列を含む場合
				//すべての開始indexを調べる
				String str = n_array[i];
				List<Integer> index_list = new ArrayList<>();
				int index = 0;
				while(str.indexOf(m_array[0], index) != -1) {
					index = str.indexOf(m_array[0], index);
					index_list.add(index);
					index++;
				}
				//Aのある行がBの1行目の文字列を含む場合の、Aのある行以降の行についてもBと一致するか調べる
				//index_listの値を一つずつ検証し、後続行
				for(int ind : index_list) {
					for(int j = 1; j < m; j++) {
						try {
							String st = n_array[i + j];
							List<Integer> i_list = new ArrayList<>();
							int in = 0;

							while(st.indexOf(m_array[j], in) != -1) {
								in = st.indexOf(m_array[j], in);
								i_list.add(in);
								in++;
							}
							if(!i_list.contains(ind)) {
								break;
							}
							if(j == m - 1) {
								papapa = true;
							}
						} catch(Exception e){
							break;
						}
					}
				}
			}
		}

		if(papapa) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

