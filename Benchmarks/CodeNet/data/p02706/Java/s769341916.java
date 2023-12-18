import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ArrayList<Integer> hour=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		int goukei=0;
		int hourdata=0;
		int result;
		
		//高橋君の夏休み
		int N=sc.nextInt();
		//高橋君の宿題の数
		int M=sc.nextInt();
		
		//宿題をやるのにかかる時間
		for(int i=0;i<M;i++) {
			hour.add(sc.nextInt());
		}
		
		//宿題をやるのにかかる時間の合計
		for(int i=0;i<hour.size();i++) {
			hourdata=hour.get(i);
			goukei+=hourdata;
		}
		
		if(goukei<=N) {
			result=N-goukei;
			System.out.println(result);
		}else {
			System.out.println(-1);
		}

	}

}
