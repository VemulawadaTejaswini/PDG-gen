import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc143/tasks/abc143_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}

		sc.close();

		Collections.sort(list, Collections.reverseOrder());
		int result = 0;
		for(int i=0;i<N;i++) {
			int a = list.get(i);
			for(int j=i+1;j<N&&j!=N;j++) {
				int b = list.get(j);

				for(int l=j+1;l<N&&l!=N;l++) {
					int c = list.get(l);
					if(c>b){
						break;
					}

				}


				int ab = a+b;
				for(int l=j+1;l<N&&l!=N;l++) {
					int c = list.get(l);
					if((c<ab)&&(a<b+c)&&(b<a+c)) {
						result++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}
