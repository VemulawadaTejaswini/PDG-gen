import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static class Hoge{
		public int a =  0;
		public int b = 0;
		Hoge(int a, int b){
			this.a = a;
			this.b = b;
		}
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			int M = Integer.parseInt(sc.next());
			List<Hoge> AB = new ArrayList<Hoge>();
			for(int i = 0; i < N; i++) {
				AB.add(new Hoge(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
			}
			
			Collections.sort(AB, new Comparator<Hoge>() {
				public int compare(Hoge a1, Hoge a2) {
					return a1.a - a2.a;
				}
			});
			
			long ret = 0L;
			int count = 0;
			for(int i = 0; i < N; i++) {
				if(count >= M) {
					break;
				}
				for(int j = 0; j < AB.get(i).b; j++) {
					if(count >= M) {
						break;
					}
					ret += AB.get(i).a;
					count++;
				}
			}
			System.out.println(ret);
		} // Scanner Close
	}
}