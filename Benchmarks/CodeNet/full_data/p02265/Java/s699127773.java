import java.util.*;

//Javaプログラマのためのアルゴリズム とデータ構造p.150~参照
//双方向リストのためのセルを定義したクラス
class CellDouble{
	CellDouble prev;
	CellDouble next;
	Integer data;
	CellDouble(Integer data){
		prev = next = null;
		this.data = data;
	}
}

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	//リストの頭へのリンク
	final CellDouble head;
	
	//入力
	int n;		//命令数
	String order;//命令
	int data;	//データ
	
	public Main() {
		//ヘッドノードにはnullを設定した
		head = new CellDouble(null);
		//リストの頭のprevとnextが自分自身をさすように設定した
		head.prev = head.next = head;
	}
	
	//双方向リストの先頭にデータdataを挿入する
	public void insertFirst(Integer data) {
		insertAfter(head, data);
	}
	
	//双方向リストのセルpの直後にデータdataを挿入する
	private void insertAfter(CellDouble p, Integer data) {
		CellDouble x = new CellDouble(data);
		x.prev = p;
		x.next = p.next;
		p.next.prev = x;
		p.next = x;
	}

	//双方向リストの先頭のデータを削除する
	public Integer removeFirst() {
		//要素がなければ例外をスローする
		if( isEmpty() ) {throw new NoSuchElementException("List is empty.");}
		//最初のセルを削除してそこに入っていた値を返す
		CellDouble cell = head.next;
		removeCell(cell);
		return cell.data;
	}
	
	//双方向リストの末尾のデータを削除する
	public Integer removeLast() {
		//要素がなければ例外をスローする
		if( isEmpty() ) {throw new NoSuchElementException("List is empty.");}
		//最後のセルを削除してそこに入っていた値を返す
		CellDouble cell = head.prev;
		removeCell(cell);
		return cell.data;
	}
	
	public void delete(Integer data) {
		CellDouble p = new CellDouble(data);
		//リストの線形探索
		for(CellDouble i = head.next; i != head; i = i.next) {
			if(i.data == p.data) {
				removeCell(i);
				break;
			}
		}
	}
	
	//削除するためのフォローメソッド
	public void removeCell(CellDouble p) {
		p.prev.next = p.next;
		p.next.prev = p.prev;
	}
	
	//双方向リストが空かどうかチェックするメソッド
	//空ならばtrue,そうでないならfalseを返す
	public boolean isEmpty() { return head.next == head; }

	public void input() {
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			order = sc.next();
			if( order.equals("insert") ) {
				data = sc.nextInt();
				insertFirst(data);
			}else if( order.equals("delete") ) {
				data = sc.nextInt();
				delete(data);
			}
			else if( order.equals("deleteFirst") ) {removeFirst();}
			else{removeLast();}
		}
	}
	
	public void output() {
		for(CellDouble p = head.next; p != head; p = p.next) {
			if(p.next == head) { output.append(p.data); }
			else{ output.append(p.data).append(" "); }
		}
		output.append("\n");
		System.out.print( output.toString() );
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}
