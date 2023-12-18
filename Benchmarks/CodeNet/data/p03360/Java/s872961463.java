import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		int A2=A;
		int B2=B;
		int C2=C;
		for(int i=0;i<K;i++) {
			A2=A2*2;
		}
		int A3=A2+B+C;
		for(int i=0;i<K;i++) {
			B2=B2*2;
		}
		int B3=A+B2+C;
		for(int i=0;i<K;i++) {
			C2=C2*2;
		}
		int C3=A+B+C2;
		int max=A3;
		if(max<B3) {
			max=B3;
		}
		if(max<C3) {
			max=C3;
		}
		System.out.println(max);
	}
}