import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		/*
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		*/


		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			list.add(a);
		}

		Collections.sort(list);

		for(int i = 0;i<m;i++) {
			list.set(n-1, list.get(n-1)/2);
			Collections.sort(list);
		}

		long sum=0;
		for(int i =0;i<list.size();i++) {
			sum+=list.get(i);
		}

		System.out.println(sum);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
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