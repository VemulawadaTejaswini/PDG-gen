import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N, K;
		int[] numberType;// 実際の数字を格納
		int[] Type;// 実際の数字が何個あるか

		String number = sc.nextLine();
		String[] numbers = number.split(" ");
		N = Integer.parseInt(numbers[0]);
		Type = new int[N];
		K = Integer.parseInt(numbers[1]);

		number = sc.nextLine();
		numbers = number.split(" ");
		numberType = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			numberType[i] = Integer.parseInt(numbers[i]);
			Type[numberType[i] - 1]++;
		}
//		for(int i = 0; i < Type.length; i++) {
//			System.out.print(Type[i] + " ");
//		}

		//大きい順にソート
		for(int i = 0; i < Type.length-1; i++) {
			for(int j = i+1; j < Type.length; j++) {
				if(Type[i] < Type[j]) {
					int tmp = Type[i];
					Type[i] = Type[j];
					Type[j] = tmp;
				}

			}
		}

//		for(int i = 0; i < Type.length; i++) {
//			System.out.print(Type[i] + " ");
//		}

		int sum = 0;
		for(int i = 0; i < K; i++) {
			sum = sum + Type[i];
		}

		System.out.println(N - sum);
	}

}