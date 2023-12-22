import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N;


	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();

		List L = new List();

		for(int i = 0;i < N;i++) {
			int num = scan.nextInt();
			switch(num) {
			case 0:
				L.insert(scan.nextInt());
				break;
			case 1:
				L.move(scan.nextInt());
				break;
			case 2:
				L.erase();
				break;
			}
		}

		L.setHead();

		while(L.cursor.lflag) {
			L.print();
		}

		scan.close();
	}
}

class List{
	Data last,cursor;

	public List() {
		last = new Data();
		cursor = last;
		last.next = last;
		last.prev = last;

		last.lflag = false;
	}

	public void insert(int x) {
		Data ndata = new Data(x);
		Data pdata = cursor.prev;

		ndata.next = cursor;
		cursor.prev = ndata;

		pdata.next = ndata;
		ndata.prev = pdata;

		cursor = ndata;
	}

	public void move(int d) {
		for(int i = 0;i < Math.abs(d);i++) {
			if(d > 0) {
				cursor = cursor.next;
				if(!cursor.lflag) {
					break;
				}
			}else {
				cursor = cursor.prev;
				if(!cursor.lflag) {
					cursor = cursor.next;
					break;
				}
			}
		}
	}

	public void erase() {
		Data ndata = cursor.next;
		Data pdata = cursor.prev;

		ndata.prev = pdata;
		pdata.next = ndata;

		cursor = ndata;
	}

	public void setHead() {
		cursor = last.next;
	}

	public void print() {
		System.out.println(cursor.num);

		move(1);
	}

	class Data{
		int num;
		boolean lflag = true;
		Data next = null,prev = null;

		Data(){
			next = null;
			prev = null;
		}

		Data(int num){
			this.num = num;
		}

	}
}
