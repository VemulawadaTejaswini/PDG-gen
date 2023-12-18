//intのオーバーフローに気をつけろ,AGCはだいたいlongにしておけ
//毎回余りを求めることでオーバーフローしなくなる
//nextLineよりnextだ
//読み込みは先に全部やっておけ
//for文を回す回数に気をつけろ

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] sa = new int [n-1];
		    int count = 0;
		    for(int i = 0; i < n; i++) {
		    	a[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n-1; i++) {
		    	sa[i] = a[i+1] - a[i];
		    }
		    
		    for(int i = 0; i < n - 2; i++) {
		    	if(sa[i] * sa[i+1] < 0) {
		    		count++;
		    		i++;
		    	}else {
		    		continue;
		    	}
		    }
		    
		    System.out.println(count + 1);
		    
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
