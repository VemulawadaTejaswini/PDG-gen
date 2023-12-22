import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();
		int n=sc.nextInt();		//数字列の長さ

		ArrayList<Integer>array=new ArrayList<>();
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		
		if(n==0) {
			System.out.println(x);
		}else {
			int mincount = 0;
			int min = 0;
			for(int i=0;i<100;i++) {

				//String b = Integer.toString(i);

				if(!array.contains(i)) {
					int aaa = x-i;
					aaa = Math.abs(aaa);
					if(mincount==0) {
						min = i;
						mincount = aaa;
					}else if(mincount>aaa) {
						mincount = aaa;
						min = i;
					}else if(mincount==aaa) {
						if(min>i) {
							mincount =aaa;
							min = i;

						}
					}

				}

			}
			System.out.println(min);
		}
	
	}

}
