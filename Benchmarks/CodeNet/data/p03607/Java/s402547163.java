import java.util.Arrays;

//intのオーバーフローに気をつけろ,AGCはだいたいlongにしておけ
//毎回余りを求めることでオーバーフローしなくなる
//nextLineよりnextだ
//charは''で囲うんだぞ
//読み込みは先に全部やっておけ
//for文を回す回数に気をつけろ
	//for文は10^3の三重はTLE,10^5の二重はTLE,10^9のforはTLE
//貪欲は使えるか？？試した？？

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int[] ar = new int[n];
		    for(int i = 0; i < n; i++) {
		    	ar[i] = sc.nextInt();
		    }
		    Arrays.sort(ar);
		    int count = 0;
		    int ans = 0;
		    for(int i = 0; i < n; i ++) {
		    	if(i > 1) {
		    		if(ar[i] == ar[i-1]) {
		    			if(count % 2 != 0) {
		    				ans--;
		    				count++;
		    			}else {
		    				ans++;
		    				count++;
		    			}
		    		}else {
		    			count = 0;
		    			ans++;
		    		}
		    	}else {
		    		count++;
		    	}
		    }
		    
		    System.out.println(ans);
		    
		    sc.close(); }

	public static void saiki(int a, String b) {
		//再帰コーディングのお手本

		if(a == 0) {
			System.out.println(b);
		}else {
			for(char ch = 'a'; ch <= 'c'; ch++) {
				saiki(a-1,b + ch);
			}
		}
	}

	public static  int gcd(int a, int b) {
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;
	}
}
