import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		//int m = sc.nextInt();

		/*
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		*/


		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			a.add(temp);
		}

		Collections.sort(a);
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			b.add(temp);
		}

		Collections.sort(b);
		ArrayList<Integer> c = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			c.add(temp);
		}

		Collections.sort(c);

		int indexA =0;
		int indexB = 0;
		int indexC=0;

		int[] holder = new int[n];

		for(int i=0;i<n;i++) {
			holder[i] =0;
			while(indexC<n) {
				if(b.get(i)<c.get(indexC)) {
					holder[i]=n-indexC;
					break;
				}else {
					indexC++;
				}
			}
		}

		for(int i=1;i<n;i++) {
			holder[n-i-1]+=holder[n-i];
		}

		int sum =0;

		for(int i =0;i<n;i++) {
			while(indexB<n) {
				if(a.get(i)<b.get(indexB)) {
					sum+=holder[indexB];
					break;
				}else {
					indexB++;
				}
			}
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