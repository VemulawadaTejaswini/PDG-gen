import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
		Map map = new Map();
		for(int i = 0;i<N;i++) {
			map.add(new Square(s.charAt(i)));
		}

		for(int i = 0;i<Q;i++) {
			String t = sc.next();
			String d = sc.next();
			map.move(t.charAt(0),d.charAt(0));
			if(map.count() == 0)break;
		}

		System.out.println(map.count());
	}

}

class Map extends ArrayList<Square>{
	void move(char t,char d) {
		int[] box = new int[this.size()];

		for(int i = 0;i<this.size();i++) {
			Square square = this.get(i);
			if(square.golemCount > 0 && square.t == t) {
				if(d == 'L') {
					if(i != 0) {
						box[i-1]+=square.golemCount;
					}
					box[i]-=square.golemCount;
				} else {
					if(i != this.size()-1) {
						box[i+1]+=square.golemCount;
					}
					box[i]-=square.golemCount;
				}
			}
		}
		for(int i = 0;i<this.size();i++) {
			this.get(i).golemCount+=box[i];
		}
	}


	int count() {
		int count = 0;
		for(Square square:this) {
			count += square.golemCount;
		}
		return count;
	}
}

class Square {
	char t;
	int golemCount;

	Square(char t){
		this.t= t;
		this.golemCount = 1;
	}
}
