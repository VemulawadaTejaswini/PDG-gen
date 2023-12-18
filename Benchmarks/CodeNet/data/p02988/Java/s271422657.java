import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int count = 0;
		int up = 0;
		int down = 0;

		Integer Array[] = new Integer[N];
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		for(int i = 0; i < N-1; i++){
			if(Array[i]<Array[i+1]){
				up++;
				down=0;
			}else{
				down++;
				up=0;
			}
			if(up==2||down==2){
				count++;
			}
			up=Math.min(up,1);
			down=Math.min(down,1);
		}

		System.out.println(count);

		sc.close();
	}
};
