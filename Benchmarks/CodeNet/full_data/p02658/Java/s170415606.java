import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


	    //入力数字の数を入力
		Scanner sc=new Scanner(System.in);

	    int count=sc.nextInt();
	    long[] nyuryoku = new long[count];

	    //入力処理
		for(int i=0;i<count;i++) {
			nyuryoku[i]=sc.nextLong();
		  //リスト追加処
		}


		long result=0;

		//乗算結果処理
		for(int i=0;i<count;i++) {
			if(result==0) {
				result+=nyuryoku[i];
			}else {
				result*=nyuryoku[i];
			}
		//10^18乗以上の数値が入力された時の処理
		long max=(long)Math.pow(10, 18);
		if(nyuryoku[i]>=max) {
		System.out.println(-1);
		}
	 }
		System.out.println(result);
  }
}