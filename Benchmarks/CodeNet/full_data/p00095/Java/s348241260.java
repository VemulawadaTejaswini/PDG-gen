import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private int n,id,value;
	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();

		id = -1;
		value = Integer.MIN_VALUE;

		for(int i = 0;i < n;i++) {
			int a = scan.nextInt();
			int v = scan.nextInt();

			if( v > value || (v == value && a < id)) {
				id = a;
				value = v;
			}
		}

		System.out.println(id + " " + value);

		scan.close();
	}
}

class Data{
	public Data(int id) {
		this.id = id;
		value = 0;
	}
	int id;
	int value;
}
