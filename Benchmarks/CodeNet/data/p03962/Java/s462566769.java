import java.util.Scanner;

public class Main {
	//問題A-Atcoder君とペンキ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] a = new int[3];//ペンキは３種類
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();//入力
		}
		if (a[0]==a[1]&&a[1]==a[2]) {//３種類そろったとき
			count=1;
		}else if(a[0]==a[1]||a[0]==a[2]){//２種類そろったとき
			count=count+2;
		}else{
			count=count+3;//何もそろわなかったとき
		}
		System.out.println(count);//何種類あったかの合計
	}

}