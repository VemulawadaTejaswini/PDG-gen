

import java.util.Scanner;

public class Main {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static int fun(String s) {
		s = s.substring(1, s.length());
		return Integer.valueOf(s);
	}
	
	public static void show(String[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(i==a.length-1 ? '\n' : ' ');
		}
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		String[] card = new String[n];
		String[] card2 = new String[n];
		for(int i=0;i<n;i++) {
			card[i] = sc.next();
			card2[i] = card[i];
		}
		
		//冒泡排序
		for(int i=0;i<n;i++) {
			for(int j=n-1; j>i; j--) {
				if(fun(card[j]) < fun(card[j-1]) ) {
					String t = card[j];
					card[j] = card[j-1];
					card[j-1] = t;
				}
			}
		}
		
		//选择排序
		for(int i=0;i<n;i++) {
			int mini = i;
			for(int j=i;j<n;j++) {
				if(fun(card2[j]) <fun(card2[mini]) ) {
					mini = j;
				}
			}
			if(mini != i) {
				String t = card2[mini];
				card2[mini] = card2[i];
				card2[i] = t;
			}
		}
		
		show(card);
		System.out.println("Stable");
		show(card2);
		boolean f = true;
		for(int i=0;i<n && f;i++) {
			if(card[i].equals(card2[i]) == false) {
				f = false;
			}
		}
		if(f) {
			System.out.println("Stable");
		}else {
			System.out.println("Not stable");
		}
		
		
	}

}

