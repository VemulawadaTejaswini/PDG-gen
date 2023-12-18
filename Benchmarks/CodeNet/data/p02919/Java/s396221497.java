import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();



		int[] a = new int[n];
		int[] b = new int[n+1];

		for(int i =0;i<n;i++) {
			a[i]= sc.nextInt();
			b[a[i]]=i;
		}
		b[0]=-1;

		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(-1,n+1);
		treeMap.put(n, n+1);
		treeMap.put(b[n], n);


		long sum = 0;

		for(int i=n-1;i>=1;i--) {
			treeMap.put(b[i], i);
			int lu = treeMap.higherKey(b[i]);
			int uu = n;
			if(lu<n) {
				uu = treeMap.higherKey(lu);
			}
			int ul = treeMap.lowerKey(b[i]);
			int ll = -1;
			if(ul>-1) {
				ll = treeMap.lowerKey(ul);
			}
			sum=sum+((ul-ll)*(lu-b[i])+(uu-lu)*(b[i]-ul))*i;
			/*if(lu==uu) {
				sum+=(ul-ll)*i;
			}else {
				if(ll==ul) {
					sum+=(uu-lu)*i;
				}else {
					sum=sum+((ul-ll)*(lu-b[i])+(uu-lu)*(b[i]-ul))*i;
				}
			}*/

		}


		System.out.println(sum);
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