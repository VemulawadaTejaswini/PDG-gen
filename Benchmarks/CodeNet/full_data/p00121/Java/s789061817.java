import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static HashMap<Key, Integer> map = new HashMap<>();
	
	static void run() {
		Scanner scan = new Scanner(System.in);
		Queue<int[]> que1 = new LinkedList<>();
		Queue<int[]> que2 = new LinkedList<>();
		// goolから何回移動したか全探索で表を作る
		int[] gool = new int[8];
		int[] count = new int[2];
		count[0] = 0; // ↑ = 1, ← = 2, ↓ = 3, → = 4  の移動をした
		count[1] = 0; // 移動した回数
		for(int i = 0; i < gool.length; i++) gool[i] = i;
		que1.offer(gool);
		que2.offer(count);
		Key keyArray = new Key(gool);
		map.put(keyArray, 0);
		int j = 0;
		while(map.size() != 40320) {
			int[] now = que1.poll();
			int[] cnt = que2.poll();
			if(now == null) {
				break;
			}
			int i; for(i = 0; now[i] != 0; i++);
			int x = i%4, y = i/4;
			
			// ↑　へ移動
			if(y == 1 && cnt[0] != 3) {
				int[] array = now.clone();
				int[] arr = cnt.clone();
				int tmp = array[i];
				array[i] = array[i-4];
				array[i-4] = tmp;
				arr[0] = 1;
				arr[1]++;
				Key key = new Key(array);
				if(! map.containsKey(key)) {
					que1.offer(array);
					que2.offer(arr);
					map.put(key, arr[1]);
				}
			}
			// ← へ移動
			if(x != 0 && cnt[0] != 4) {
				int[] array = now.clone();
				int[] arr = cnt.clone();
				int tmp = array[i];
				array[i] = array[i-1];
				array[i-1] = tmp;
				arr[0] = 2;
				arr[1]++;
				Key key = new Key(array);
				if(! map.containsKey(key)) {
					que1.offer(array);
					que2.offer(arr);
					map.put(key, arr[1]);
				}
			}			
			// ↓　へ移動
			if(y == 0 && cnt[0] != 1) {
				int[] array = now.clone();
				int[] arr = cnt.clone();
				int tmp = array[i];
				array[i] = array[i+4];
				array[i+4] = tmp;
				arr[0] = 3;
				arr[1]++;
				Key key = new Key(array);
				if(! map.containsKey(key)) {
					que1.offer(array);
					que2.offer(arr);
					map.put(key, arr[1]);
				}
			}
			// → へ移動
			if(x != 3 && cnt[0] != 2) {
				int[] array = now.clone();
				int[] arr = cnt.clone();
				int tmp = array[i];
				array[i] = array[i+1];
				array[i+1] = tmp;
				arr[0] = 4;
				arr[1]++;
				Key key = new Key(array);
				if(! map.containsKey(key)) {
					que1.offer(array);
					que2.offer(arr);
					map.put(key, arr[1]);
				}
			}
		}
		
//		System.out.println("Input");
		
		// 入力
		int[] inputArray = new int[8];
		for(int i = 0; i < 8; i++) inputArray[i] = scan.nextInt();
		Key input = new Key(inputArray);
		
		// 出力
		System.out.println(map.get(input));
	}
	
	public static void main(String[] args) {
		run();
	}
}

class Key {
	private int[] array = new int[8];
	
	public Key(int[] array) {
		this.array = array.clone();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			return Arrays.equals(this.array, ((Key)obj).array);
		}
		return false;
	}
	
	public int hashCode() {
		return Arrays.hashCode(this.array);
	}
}

