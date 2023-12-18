import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		boolean[] b = new boolean[N];
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			if(a==i+1) {
				b[i] =true;
			} else {
				b[i] =false;
			}
		}
		int count=0;
		int trueCount=0;
		boolean flg= false;
		for(int i=0;i<N;i++) {
			if(b[i]==true) {
				if (flg==false) {
					flg =true;
					trueCount=1;
				} else {
					trueCount++;
				}
			} else {
				if (trueCount>0) {
					if(trueCount>=2) {
						count+=trueCount-1;
					} else {
						count+=trueCount;
					}
				}
				flg =false;
				trueCount=0;
			}
		}
		if (trueCount>0) {
			if(trueCount>=2) {
				count+=trueCount-1;
			} else {
				count+=trueCount;
			}
		}
		System.out.println(count);
	}

}