import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] argv){
		Scanner scan = new Scanner(System.in);
		//palace(scan);
		id(scan);
	}
	public static void palace(Scanner scan){
		//入力値の中で，最もAに近いもののインデックスを出力
		int N = scan.nextInt(); 
		int T = scan.nextInt(); int A = scan.nextInt();
		int in = scan.nextInt();
		int index = 1;
		double min = Math.abs(A-T+0.006*in);
		for(int i=2;i<=N;i++){
			in = scan.nextInt();
			double dif = Math.abs(A-T+0.006*in);
			if(min>dif){
				min = dif;
				index = i;
			}
		}
		System.out.println(index);
	}
	public static void id(Scanner scan){
		int N = scan.nextInt();
		int M = scan.nextInt();
		City[] cit = new City[M];
		City[] ordCit = new City[M];
		for(int i=0;i<M;i++){
			int p = scan.nextInt();
			int y = scan.nextInt();
			ordCit[i] = new City(p,y);
			cit[i] = ordCit[i];//場所参照で値がオブジェクトなので値の書き換えは有効
		}
		Arrays.sort(ordCit);
		ordCit[0].idInPref = 1;
		for(int i=1;i<M;i++){
			if(ordCit[i].pref != ordCit[i-1].pref)
				ordCit[i].idInPref = 1;
			else
				ordCit[i].idInPref = ordCit[i-1].idInPref + 1;
		}
		
		for(int i=0;i<M;i++)
			System.out.printf("%06d%06d\n",cit[i].pref,cit[i].idInPref);
	}
}

class City implements Comparable<City>{
	int pref;
	int year;
	int idInPref = 0;
	public City(int p, int year){
		this.pref = p;
		this.year = year;
	}
	public int compareTo(City c1){
		return this.pref==c1.pref ? (this.year - c1.year):(this.pref - c1.pref);
	}
}