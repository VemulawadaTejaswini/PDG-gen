import java.util.*;
import java.io.*;

//双方向連結リスト構造

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int loop = in.nextInt();
		MyLinkedList list = new MyLinkedList();

		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					int x = Integer.parseInt(in.next());
					list.add(x);
					break;

				case 1:
					int d = Integer.parseInt(in.next());
					list.move(d);
					break;

				case 2:
					list.remove();
					break;
			}
		}

		ArrayList<Integer> dumpArr = list.dump();
		PrintWriter out = new PrintWriter(System.out);
		for(Integer value : dumpArr) {
			out.println(value);
		}
		out.flush();
		in.close();
	}

}

class ListNode{
	int value;
	ListNode prv, next;

	ListNode(int v){
		value = v;
		prv = this;
		next = this;
	}
}

class MyLinkedList{
	private ListNode END, NOW;

	MyLinkedList(){
		END = new ListNode(0);
		NOW = END; //カーソル
	}

	void add(int x) {
		ListNode NEW = new ListNode(x);

		//ポインタ切替処理
		//先に新規ノードのポインタを定義させる
		NEW.next = NOW;
		NEW.prv = NOW.prv;

		//次に既存のノードのポインタを切り替える
		NEW.prv.next = NEW;
		NOW.prv = NEW;

		//カーソル移動
		NOW = NEW;
	}

	void remove() {
		//ポインタ切替処理
		NOW.prv.next = NOW.next;
		NOW.next.prv = NOW.prv;

		//カーソル移動
		NOW = NOW.next;
	}

	void move(int d) {

		if(d > 0) {
			for(int i = 0; i < d; i++) {
				NOW = NOW.next;
			}
		}else {
			for(int i = 0; i > d; i--) {
				NOW = NOW.prv;
			}
		}
	}

	ArrayList<Integer> dump() {
		ArrayList<Integer> dumpArr = new ArrayList<>();
		ListNode now = END.next;

		while(now != END) {
			dumpArr.add(now.value);
			now = now.next;
		}
		return dumpArr;
	}
}
