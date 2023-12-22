import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int array[] = new int[N];
		int anser = Integer.MIN_VALUE;
		for(int i = 1 ; i < N ; i++){
			array[i] = sc.nextInt();
			if(anser < array[0] - array[i] ){
				anser = array[0] - array[i];
			}
		}
		sc.close();
		System.out.println(anser);
	}

}
