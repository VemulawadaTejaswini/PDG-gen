import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		Column c = new Column(s);
		int h = c.getHandsSize();
		if(k > h) {
			k = h - 1;
		}
		int maxPoint = 0;
		for(int i = 0; i < h - k; i++) {
			int point = c.getPoint(i, i + k);
			if(point > maxPoint) {
				maxPoint = point;
			}
		}
		System.out.println(maxPoint);
	}

}
class Column{
	ArrayList<Integer> Hands = new ArrayList<Integer>();
	ArrayList<Integer> Stands = new ArrayList<Integer>();
	Column(String s){
		StringBuilder sb = new StringBuilder(s);
		while(sb.length() != 0){
			addHandStand(sb);
		}
		if(Stands.get(Stands.size() - 1) != 0) {
			Hands.add(0);
		}
	}
	void addHandStand(StringBuilder sb) {
		int h = sb.indexOf("0");
		if(h == -1) {
			h = sb.length();
		}
		Hands.add(h);
		sb.delete(0, h);

		int s = sb.indexOf("1");
		if(s == -1) {
			s = sb.length();
		}
		Stands.add(s);
		sb.delete(0, s);
	}
	int getPoint(int i, int i2) {
		if(i == i2) {
			return Hands.get(i);
		}else if(i > i2){
			return 0;
		}
		return Hands.get(i) + Stands.get(i) + getPoint(i+1, i2);
	}
	int getHandsSize() {
		return Hands.size();
	}
}
