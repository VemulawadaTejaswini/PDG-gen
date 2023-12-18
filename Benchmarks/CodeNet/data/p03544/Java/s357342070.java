import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] l = new long[n+1];
		l[0]=2;
		l[1]=1;
		for(int i=0;i<n+1;i++) {
			if(i==0) {
				l[i]=2;
			}else if(i==1) {
				l[i]=1;
			}else {
				l[i]=l[i-2]+l[i-1];
			}
		}
		System.out.println(l[n]);


	}

}
