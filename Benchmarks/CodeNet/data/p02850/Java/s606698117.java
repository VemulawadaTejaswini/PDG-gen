import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] a = new int[n-1];
		int[] b = new int[n-1];
		
		for(int i=0;i<n-1;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[] color = new int[n-1];
		
		ArrayList<Integer> noColored = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			noColored.add(i);
		}
		int counter =1;
		while(noColored.size()>0) {
			TreeSet<Integer> included = new TreeSet<Integer>();
			included.add(a[noColored.get(0)]);
			included.add(b[noColored.get(0)]);
			color[noColored.get(0)] = counter;
			noColored.remove(0);
			int nocolorsize =noColored.size();
			if(nocolorsize>0) {
				for(int i=nocolorsize-1;i>-1;i--) {
					if(!included.contains(a[noColored.get(i)])) {
						if(!included.contains(b[noColored.get(i)])) {
							color[noColored.get(i)]=counter;
							included.add(a[noColored.get(i)]);
							included.add(b[noColored.get(i)]);
							noColored.remove(i);
						}
					}
				}
			}
			counter++;
		}
		System.out.println(counter-1);
		for(int i =0;i<n-1;i++) {
			System.out.println(color[i]);
		}
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
