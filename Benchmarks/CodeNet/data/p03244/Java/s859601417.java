import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v;
		int m = 100001; //もとは10000と書いてた。10000までの数が入力で与えられるので、1増やす
		int[] vcnt0 = new int[m],vcnt1 = new int[m];
		//初期値をすべて0にするにはArrays.fill(配列名,0)とかいう技もある
		int i,cnt = 0;
		for(i = 0;i < n;i ++) {
			v = sc.nextInt(); //もともと配列に入れてたけど別に配列に入れる必要がない
			if(i % 2 == 0) {
				vcnt0[v] += 1; 
			}else {
				vcnt1[v] += 1;
			}
		}
		int max0_0 = 0,max0_1 = 0,max1_0 = 0,max1_1 = 0;//,maxidx0 = 0,maxidx1 = 0;
		//配列のインデックスだけ記録しとけば配列の中身はいつでも参照できる
		for(i = 1;i < m-1;i ++) { //[0]はここでは使ってないから1から
			if(vcnt0[max0_0] < vcnt0[i]) {
				max0_1 = max0_0; 
				max0_0 = i;
			}else if(vcnt0[max0_1] < vcnt0[i]) {
				max0_1 = i;
			}
		}
		for(i = 1;i < m-1;i ++) {
			if(vcnt1[max1_0] < vcnt1[i]) {
				max1_1 = max1_0; 
				max1_0 = i;
			}else if(vcnt1[max1_1] < vcnt1[i]) {
				max1_1 = i;
			}
		}
		if(max0_0 == max1_0) {
			cnt = n - Math.max(vcnt0[max0_0] + vcnt1[max1_1],
					vcnt0[max0_1] + vcnt1[max1_0]);
		}else {
			cnt = n - (vcnt0[max0_0] + vcnt1[max1_0]);
		}
		System.out.println(cnt);
	}
}