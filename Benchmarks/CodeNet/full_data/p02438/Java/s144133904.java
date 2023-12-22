import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node{
	private long value;
	private int next;

	Node (long v){
		value = v;
		next = -1;  //null代わり
	}

	public void setNext(int p) { next = p; }
	public long getValue() { return value; }
	public int getNext() { return next; }


}

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			List<Node> all = new ArrayList<Node>();
			int n = sc.nextInt();
			int[] first = new int[n];
			int[] last = new int[n];
			for (int i=0; i<n; i++) {
				first[i] = last[i] = -1;  //nullにする
			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int query = sc.nextInt();  //命令：0 insert 1 dump 2 splice
				int al,al2 ;  //何個目のArrayList
				switch (query) {
				//insert(al,x)
				case 0:
					al = sc.nextInt();
					long x = sc.nextLong();
					all.add(new Node(x));
					int now = all.size()-1;  //今入れた位置
					if (first[al] == -1) {  //なにも入っていない場合
						first[al] = last[al] = now;  //今入れた位置を記録
					} else {
						all.get(last[al]).setNext(now);
						last[al] = now;
					}
					break;
				//dump(al)
				case 1:
					al = sc.nextInt();
					int target = first[al];  //先頭を取得
					if (target != -1) {  
						System.out.print(all.get(target).getValue());  //数字を出力
						while (all.get(target).getNext() != -1) {
							target = all.get(target).getNext();
							System.out.print(" " + all.get(target).getValue());  //数字を出力
						}
					}
					System.out.print('\n');  //空行出力
					break;
				//splice(al2,al)
				case 2:
					al2 = sc.nextInt();
					al = sc.nextInt();
					if (first[al] == -1) {  //なにも入っていない場合
						first[al] = first[al2];
						last[al] = last[al2];
					} else {
						all.get(last[al]).setNext(first[al2]);
						last[al] = last[al2];
					}
					first[al2] = last[al2] = -1;  //al2をnullにする
					break;
				}
			}

		}
	}
}
