import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int k = Integer.parseInt(ss0[0]);
		int t = Integer.parseInt(ss0[1]);

		// 1行、複数文字、Listに格納
		List<String> listStr = Arrays.asList( br.readLine().trim().split(" ", 0) );

		// 数字のListに、文字列のListを変換しながら入れる
		List<Integer> list = new ArrayList<Integer>();
		for(String s: listStr) {
			list.add( Integer.parseInt(s) );
		}


		int i = 0;
		int j = 0;

		while (list.size() > 1) {
			//リストのソート
			Collections.sort(list); // 未指定ならば昇順
			
			i = list.get(0);
			j = list.get(list.size()-1);
			if (j>=i){
				list.set(list.size()-1, j-i);
				list.remove(0);
			} else {
			}
		}

		i = list.get(0) -1;
		i = (i < 0) ? 0 : i;
		System.out.println(i);
    }
}


