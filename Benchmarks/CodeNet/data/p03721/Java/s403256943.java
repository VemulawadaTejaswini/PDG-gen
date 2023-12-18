import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc061.contest.atcoder.jp/tasks/abc061_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		Item[] items = new Item[N];
		for(int i=0; i<N; i++){
			items[i] = new Item(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
		}
		sc.close();
		
		Arrays.sort(items, (o1, o2) -> o1.a - o2.a );

		long current = 0;
		int index = 0;
		while(current+(long)items[index].b<K){
			current = current+(long)items[index].b;
			index++;
		}

		System.out.println(items[index].a);
		
	}
	
	static class Item{
		int a;
		int b;
		Item(int a, int b){
			this.a = a;
			this.b = b;
		}
	}

}