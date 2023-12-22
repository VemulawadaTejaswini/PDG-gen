import java.util.Scanner;

class Solve{
	public int s[];
	public int t[];
	public int count;
	public void binary(int left,int right,int num){
		int mid = (left + right) / 2;
		if(right - left <= 1) {
			if(s[right] == num || s[left] == num) count++;
		}
		else if(s[mid] == num) count++;
		else if(s[mid] < num) binary(mid,right,num);
		else binary(left,mid,num);
	}
}

class Main{//一部全探索の問題のコードを使用
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		Solve sv = new Solve();
		//prepare s
		int n = sc.nextInt();
		sv.s = new int[n];
		for(int i = 0;i < n;i++) {
			sv.s[i] = sc.nextInt();
		}
		//prepare t
		int q = sc.nextInt();
		sv.t = new int[q];
		for(int i = 0;i < q;i++) {
			sv.t[i] = sc.nextInt();
		}
		//find and count
		sv.count = 0;
		for(int i = 0;i < q;i++) {
			sv.binary(0,n - 1,sv.t[i]);
		}
		//print
		System.out.printf("%d\n",sv.count);
		sc.close();
	}
}
