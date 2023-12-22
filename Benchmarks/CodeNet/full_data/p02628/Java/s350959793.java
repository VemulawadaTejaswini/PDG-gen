import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		int[] kingaku=new int[N];
		int goukei=0;
		for(int i=0;i<kingaku.length;i++) {
			kingaku[i]=scan.nextInt();
		}
		Arrays.sort(kingaku);
		for(int i=0;i<K;i++) {
			goukei+=kingaku[i];
		}
		System.out.println(goukei);
	}
}