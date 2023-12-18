import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();



		int[] a = new int[n];
		int[] b = new int[n];
		//double temp =0;
		//List<Double> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int score = 0;

		List<Integer> list = new ArrayList<>();
		for(int i = m-1;i>=0;i--) {
			for(int j=0;j<n;j++) {
				if(m-i==a[j]) {
					list.add(j);
				}
			}
			int max = 0;
			int maxIndex = 0;
			for(int j=0;j<list.size();j++) {
				if(b[list.get(j)]>max) {
					maxIndex=j;
					max = b[list.get(j)];
				}
			}
			score += max;
			if(list.size()>0) list.remove(maxIndex);
			
		}
		System.out.println(score);
	}

}