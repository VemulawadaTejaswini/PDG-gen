package java_kadai_1;

import java.util.Scanner;

public class Main {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int e= sc.nextInt();
		
		int f,g,ans;
		
		if(a<b && a<c){
		f = a;	
		}
		else if(b<a && b<c){
			f = b;
		}
		else{f = c;}
		if(d<e){g=d;}
		else{g=e;}
		ans=f+g-50;
		System.out.println(ans);
	}
}