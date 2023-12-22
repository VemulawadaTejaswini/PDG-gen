import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int n=Integer.parseInt(src.next());

		List<Contents> list = new ArrayList<>();

		for (int i=0; i<n; i++) {
			int value = Integer.parseInt(src.next());
			int weight = Integer.parseInt(src.next());
			char type = src.next().charAt(0);
			long time = Long.parseLong(src.next());
			String name = src.next();
			
			list.add(new Contents(value, weight, type, time, name));
		}

		list.sort(Comparator.comparingInt(Contents :: getX)
				.thenComparingInt(Contents :: getY)
				.thenComparing(Contents :: getX2)
				.thenComparingLong(Contents :: getZ)
				.thenComparing(Contents :: getY2));

		for(int i=0; i<n; i++) {

			System.out.println(list.get(i).x + " " + list.get(i).y + " " + list.get(i).x2 + " " + list.get(i).z + " " + list.get(i).y2);

		}

	}
}

//各情報を返す
class Contents{

	int x, y;
	long z;
	char x2;
	String y2;

	Contents(int a, int b, char c, long d, String e){

		x = a;
		y = b;
		z = d;
		x2 = c;
		y2 = e;

	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
	
	long getZ() {
		return z;
	}
	
	char getX2() {
		return x2;
	}
	
	String getY2() {
		return y2;
	}
}

