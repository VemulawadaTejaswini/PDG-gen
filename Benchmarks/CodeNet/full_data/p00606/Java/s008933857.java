import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cleaning Robot
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1020&lang=jp
 *
 * @author Igari Kazuya
 *
 */
public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ©®¶¬³ê½\bhEX^u
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();

			if(n == 0){
				break;
			}

			String s,t,b;
			s = sc.next();
			t = sc.next();
			b = sc.next();

			int[][] map = new int[5][5];
			for(int i=0;i<5;i++){
				map[0][i] = 1;
				map[i][0] = 1;
				map[4][i] = 1;
				map[i][4] = 1;
			}

			int ss = s.charAt(0) - 'A';
			int tt = t.charAt(0) - 'A';
			int bb = b.charAt(0) - 'A';

			//map[ss/3 + 1][ss%3 + 1] = 3;//@B¿áñ
			//map[tt/3 + 1][tt%3 + 1] = 2;//[dí
			map[bb/3 + 1][bb%3 + 1] = 1;//qÉ

			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> buf = new ArrayList<Integer>();

			list.add(ss);

			for(int i=0;i<n;i++){
				for(int j=0;j<list.size();j++){
					int bufint = list.get(j);
					if(map[bufint/3][bufint%3+1] != 1){
						buf.add(bufint - 3);
					}else{
						buf.add(bufint);
					}
					if(map[bufint/3+2][bufint%3+1] != 1){
						buf.add(bufint + 3);
					}else{
						buf.add(bufint);
					}
					if(map[bufint/3+1][bufint%3] != 1){
						buf.add(bufint - 1);
					}else{
						buf.add(bufint);
					}
					if(map[bufint/3+1][bufint%3+2] != 1){
						buf.add(bufint + 1);
					}else{
						buf.add(bufint);
					}
				}
				list.clear();

				for(int j=0;j<buf.size();j++){
					list.add(buf.get(j));
				}
				buf.clear();
			}

			int count=0;
			for(int i=0;i<list.size();i++){
				if(list.get(i) == tt){
					count++;
				}
			}
			if(list.size()!=0){
				System.out.println((double)count/list.size());
			}
		}
	}

}