import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] s = new char[n];
		String hoge;
		String A = "A";
		String B = "B";
		int a=0, b=0, sum=0;
		for(int i=0;i<n;i++) {
			hoge =sc.next();
			char[] chara = hoge.toCharArray();
			if(chara[0]==B.toCharArray()[0]) {//head is B
				b++;
			}
			if(chara[hoge.length()-1]==A.toCharArray()[0]) {//tale is A
				a++;
			}
			for(int j=0;j<hoge.length()-1;j++) {//how many AB is in
				if(chara[j]==A.toCharArray()[0] && chara[j+1]==B.toCharArray()[0]) {
					sum++;
				}
			}
		}
		if(a==b && a>0) {
			a--;
		}
		sum+=min(a, b, n-1);
		System.out.print(sum);
		
	}
	
	public static int min(int a, int b, int c) {
		if(a<=b && a<=c) {
			return a;
		}
		else if(b<=c) {
			return b;
		}
		else {
			return c;
		}
	}

	
}