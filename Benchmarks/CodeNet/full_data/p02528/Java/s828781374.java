import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int num = sc.nextInt();  // 入力する整数の数
		int[] value = new int[num];

		for (int i = 0; i < num; i++){
			value[i] = sc.nextInt();
		}

		// 昇順に並び替える
		for (int i = 0; i < num - 1; i++){
			for (int j = 0; j < num - 1 - i; j++){
				if (value[j] > value[j + 1]){
					// 入れ換える
					int v = value[j + 1];
					value[j + 1] = value[j];
					value[j] = v;
				}
			}
		}

		// 出力
		for (int i = 0; i < num; i++){
			System.out.printf("%d", value[i]);
			if (i == num - 1){
				System.out.printf("%n");
			}else{
				System.out.printf(" ");
			}
		}
	}
}