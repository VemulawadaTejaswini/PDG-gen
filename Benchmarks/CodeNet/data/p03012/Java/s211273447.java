import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6/9コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sa=100;
		int konkai=1000;
		List<Integer> list= new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		//System.out.println(list.get(1));
		for(int i=0;n-1>i;i++) {
			int one=0;
			int two=0;
			for(int l=0;i+1>l;l++) {
				one=one+list.get(l);
			}
			for(int t=0;n-1-i>t;t++) {
				two=two+list.get(n-1-t);
			}

			konkai=Math.abs(one-two);
			if(konkai<sa) {
				sa=konkai;
			}

		}
		System.out.println(sa);



	}

}
