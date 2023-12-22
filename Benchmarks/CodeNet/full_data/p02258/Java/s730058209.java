import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int array[] = new int[N];
		int anser = Integer.MIN_VALUE;
		for(int i = 0 ; i < N ; i++){
			array[i] = sc.nextInt();
		}

		for(int j = 0; j < N-1; j++){
			for(int k = j+1; k < N; k++){
				if(anser < array[k] - array[j] ){
					anser = array[k] - array[j];
				}
			}
		}
		sc.close();
		System.out.println(anser);
	}

}

