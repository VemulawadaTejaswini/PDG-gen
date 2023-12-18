import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		//int x = sc.nextInt();
		//String s = sc.next();

		//String[] ss = s.split("");

		//int[] a = new int[n];

		long upper = n;
		long target =2;
		long lastHit = 1;

		while(target<=upper) {
			if(n%target==0) {
				lastHit = target;
			}else {

			}
			upper = n/target;
			target++;
		}


		System.out.println(lastHit+ n/lastHit -2);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
		treeMap.put(b[n], n);
		*/

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
