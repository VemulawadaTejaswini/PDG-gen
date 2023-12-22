import java.util.*;

class Place {
	private int num , count;
	public Place(int num) {
		this.num = num;
		this.count = 0;
	}
	public void add(int n) {
		this.count+=n;
	}
	public boolean lower( Place p ) {
		return this.count < p.count;
	}
	public int getSum() {
		return this.count;
	}
	public int getNum() {
		return this.num;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( true ) {
			int st = sc.nextInt(),
				num = sc.nextInt();
			if ( st == 0 && num == 0 ) break;
			Place[] result = new Place[num];
			for ( int i = 0; i < num; i++ )
				result[i] = new Place(i+1);
			for ( int i = 0; i < st; i++ )
				for ( int j = 0; j < num; j++ )
					result[j].add(sc.nextInt());
			boolean sort_complete = true;
			while ( sort_complete ) {
				int count = 0;
				for ( int i = 0; i < result.length-1; i++ ) {
					if ( result[i].lower(result[i+1]) ) {
						Place p = result[i];
						result[i] = result[i+1];
						result[i+1] = p;
						count++;
					}
				}
				sort_complete = 0 != count;
			}
			for ( int i = 0; i < result.length; i++ )
				System.out.print(result[i].getNum()+" ");
			System.out.println();
		}
	}
}