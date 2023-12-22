import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Goods{
	private int value;
	private int weight;
	private char goodsType;
	private long time;
	private String name;

	//コンストラクタ
	public Goods(int v, int w, char gt, long t, String na) {
		value = v;
		weight = w;
		goodsType = gt;
		time = t;
		name = na;
	}

	//ゲット--------------------------
	public int getValue() { return value;}
	public int getWeight() { return weight;}
	public char getType() {return goodsType;}
	public long getTime() {return time;}
	public String getName() {return name;}
}

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			Goods[] array = new Goods[n];  //Goodsの配列
			for (int i=0; i<n; i++) {
				int v = sc.nextInt();
				int w = sc.nextInt();
				String gt0 = sc.next();
				char gt = gt0.charAt(0);
				long t = sc.nextLong();
				String na = sc.next();
				array[i] = new Goods(v,w,gt,t,na);
			}
			Arrays.sort(array,new Comparator<Goods>() {
				@Override
				public int compare(Goods g0, Goods g1) {
					if (g0.getValue() > g1.getValue()) return 1;
					else if (g0.getValue() < g1.getValue()) return -1;
					if (g0.getWeight() > g1.getWeight()) return 1;
					else if (g0.getWeight() < g1.getWeight()) return -1;
					if (g0.getType() > g1.getType()) return 1;
					else if (g0.getType() < g1.getType()) return -1;
					if (g0.getTime() > g1.getTime()) return 1;
					else if (g0.getTime() < g1.getTime()) return -1;
					if (g0.getName().compareTo(g1.getName()) > 0) return 1;
					return -1;
				}
			});
			for (int i=0; i<n; i++) {
				System.out.println(array[i].getValue() + " " + array[i].getWeight()+ " " + array[i].getType()+ " " + array[i].getTime()+ " " + array[i].getName());
			}
		}
	}
}

