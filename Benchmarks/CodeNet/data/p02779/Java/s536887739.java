import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		//Long[] anser = new Long[N];
		List<Long> list = new ArrayList<>();
		List<Long> anser = new ArrayList<>();
		for(int i = 0; i < N ; i++) {
			list.add(sc.nextLong());
		}

		//重複しているものを追加しない、自動ソート済み
		TreeSet<Long> TS = new TreeSet<>(list);

		//long s = 0;s<TS ; s++
		for(Long s:TS){
			long coun=0;
			for(Long c:list){
			if(s == c) {
				coun++;
			}
			}
			for(int a = 0; a<N; a++) {
				if(coun >1) {
					anser.add(coun);
				}
			}
			//System.out.println(s+"が"+coun+"つ");
			}

		if(anser.size() ==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
		}