import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();



		ArrayList<Integer> ss = new ArrayList<>();
		ArrayList<Integer> tt = new ArrayList<>();

		for(int i=0;i<m;i++) {
			ss.add(sc.nextInt());
			tt.add(sc.nextInt());
		}

		int[][] st = new int[n+1][n];

		for(int i=1;i<n+1;i++) {
			int counter =0;
			for(int j=0;j<ss.size();j++) {
				if(ss.get(j)==i) {
					counter++;
					st[i][counter]=tt.get(j);
				}
			}
			st[i][0]=counter;
		}

		double[] p = new double[n+1];

		double min =700;

		for(int i =1;i<n;i++) {//どこからの枝を狩るか

			for(int j =0;j<n+1;j++) {
				p[j]=0;
			}
			for(int j=n-1;j>0;j--) {//動的計画法

				double max = 0;
				int maxIndex = -1;
				if(i==j&&st[j][0]!=1) {//


					for(int k=1;k<st[j][0]+1;k++) {
						if(p[st[j][k]]>max) {
							max = p[st[j][k]];
							maxIndex = k;
						}
					}

				}

				for(int k=1;k<st[j][0]+1;k++) {
					if(maxIndex==-1) {
						if(k!=maxIndex)p[j]+=(p[st[j][k]]+1.0)*(1.0/st[j][0]);
					}else {
						if(k!=maxIndex)p[j]+=(p[st[j][k]]+1.0)*(1.0/(st[j][0]-1));
					}
				}

			}
			if(min>p[1])min=p[1];
		}




		//String s = sc.next();

		//String[] ss = s.split("");

		//int[] a = new int[n];


		double ans = min;

		System.out.println(ans);

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
