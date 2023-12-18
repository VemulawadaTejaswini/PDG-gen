import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i ++) {
			a[i] = sc.nextInt();
		}
		int bnum = a[0], find = 0,cnt = 0;
		for(int i = 0;i < N * (N - 1) / 2;i ++) {
			if(bnum == a[bnum - 1]) break;
			bnum = a[bnum - 1];
			cnt ++;
			if(bnum == 2) {
				find = 1;
				cnt ++;  //最後にボタン２が光るボタンを押す
				break;
			}
		}
		if(find == 1) System.out.println(cnt);
		else System.out.println("-1");
		System.out.println(cnt);
	}
}
