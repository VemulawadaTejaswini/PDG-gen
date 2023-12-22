import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int listNum = sc.nextInt();
			int qLen = sc.nextInt();
			MyList[] lists = new MyList[listNum];

			for(int i=0;i<listNum;i++) {
				lists[i] = new MyList();
			}

			for(int i=0;i<qLen;i++) {
				int query = sc.nextInt();
				int t = sc.nextInt();
				switch(query) {
				case 0:
					lists[t].insert(sc.nextInt());;
					break;
				case 1:
					lists[t].dump();
					break;
				case 2:
					lists[sc.nextInt()].splice(lists[t]);
					break;
				}
			}
		}
	}
	/**
	 * リストの各要素です
	 */
	static class MyNode{
		int value;
		MyNode next;

		public MyNode(int value) {
			this.value = value;
			this.next = null;
		}
		/**
		 * 次要素をセットします
		 * @param node 次要素
		 */
		public void setNext(MyNode node) {
			this.next = node;
		}
	}
	/**
	 * 自作(単方向)リスト
	 */
	static class MyList{
		MyNode head;
		MyNode last;
		public MyList() {
			this.head = null;
			this.last = null;
		}
		/**
		 * リストに要素を追加します
		 * @param x
		 */
		public void insert(int x) {
			MyNode node = new MyNode(x);
			if(this.head == null) {
				this.head = node;
				this.last = node;
			}
			else {
				this.last.setNext(node);
				this.last = node;
			}
		}
		/**
		 * これに引数のリストを連結し、引数リストは亡き者になります
		 * @param list
		 */
		public void splice(MyList list) {
			if(this.head == null) {
				this.head = list.head;
				this.last = list.last;
			}
			else {
				this.last.setNext(list.head);
				this.last = list.last;
			}
			list.head = null;
			list.last = null;
		}
		/**
		 * リストの全要素を表示します
		 */
		public void dump() {
			MyNode node = this.head;
			if(node != null) {
				System.out.print(node.value);
				for(node = node.next;node != null;node = node.next) {
					System.out.print(" " + node.value);
				}
			}
			System.out.println();
		}
	}
}
