import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc061.contest.atcoder.jp/tasks/abc061_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		Item[] items = new Item[N];
		for(int i=0; i<N; i++){
			items[i] = new Item(Long.parseLong(sc.next()),Long.parseLong(sc.next()));
		}
		sc.close();
		
		Arrays.sort(items, (o1, o2) -> (int)o1.a - (int)o2.a );

		long current = 0;
		int index = 0;
		while(index<N && current+items[index].b<K){
			current = current+items[index].b;
			index++;
		}

		System.out.println(items[index].a);
		
	}
	
	static class Item{
		long a;
		long b;
		Item(long a, long b){
			this.a = a;
			this.b = b;
		}
	}

}