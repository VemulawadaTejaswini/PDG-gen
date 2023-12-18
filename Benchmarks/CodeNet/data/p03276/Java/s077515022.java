
import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		//String s = sc.next();
		/*
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);*/
		int[] x = new int[n];


		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}

		boolean flag = true;
		int currentBest = 1000000;

		for(int i=0;i<n-k+1;i++) {
			if(x[i]<=0&&x[i+k-1]<=0) {
				if(currentBest>Math.abs(x[i])) {
					currentBest = Math.abs(x[i]);
				}
			}else {
				if(x[i]>=0&&x[i+k-1]>=0) {
					if(currentBest>Math.abs(x[i+k-1])) {
						currentBest = x[i+k-1];
					}
				}else {
					int a = Math.max(Math.abs(x[i]), Math.abs(x[i+k-1]));
					a += Math.min(Math.abs(x[i]), Math.abs(x[i+k-1]))*2;
					if(currentBest>a) {
						currentBest = a;
					}
				}
			}



		}
		System.out.println(currentBest);
	}
	static boolean check(int t,int x,int y) {
		if(Math.abs(x)+Math.abs(y)>t)return false;
		if((Math.abs(x)+Math.abs(y)-t)%2==0) {
			return true;
		}else {
			return false;
		}

	}
}