/*
 *ver2
 *累積gcdの最大値計算をsortメソッドで取得
 *l_gcdとr_gcdの配列を取得してからgcd計算
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	}
	
	//最大公約数の配列
	int[] gcd = new int[n];

	//端の処理
	gcd[0] = ruisekiGcd(a, 1, n);
	gcd[n-1] = ruisekiGcd(a, 0, n-1);

	//右側、左側累積GCDを作成
	int[] l_gcd = new int[n];
	int[] r_gcd = new int[n];
	l_gcd[0] = a[0];
	r_gcd[n-1] = a[n-1];
	for(int i = 1; i < n; i++){
	    l_gcd[i] = getGcd(l_gcd[i-1], a[i]);
	    r_gcd[n-i-1] = getGcd(r_gcd[n-1], a[n-i-1]);
	}
	
	//累積GCDを作成
	for(int i = 1; i < n-1; i++){
	    gcd[i] = getGcd(l_gcd[i], r_gcd[i]);
	}

	//累積GCDの最大値を計算
	Arrays.sort(gcd);
	
	System.out.println(gcd[n-1]);
    }

    static int ruisekiGcd(int[] a, int s, int l){
	int gcd = a[s];
	for(int i = s+1; i < l; i++){
	    gcd = getGcd(gcd, a[i]);
	}
	return gcd;
    }

    static int getGcd(int a, int b){
	if(a < b){
	    int tmp = a;
	    a = b;
	    b = tmp;
	}

	while(b != 0){
	    int tmp = a % b;
	    a = b;
	    b = tmp;
	}
	
	return a;
    }
}
