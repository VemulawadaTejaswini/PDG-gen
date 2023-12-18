import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Pair v = new Pair();
		v.from = x2-x1;
		v.end = y2 - y1;
		
		
		int x4 = x1-v.end;
		int y4 = y1 + v.from;
		int x3 = x4+ + v.from;
		int y3 = y4 + v.end;
		System.out.println(x3 + " "+ y3 + " "+x4 + " "+y4);
		

	}


}




class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

