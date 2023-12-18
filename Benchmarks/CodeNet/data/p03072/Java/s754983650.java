import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		int count = 0;
		int max = 0;

		for(int i=0;i<n;i++){
			int h = sc.nextInt();
			if(h>=max){
				count++;
				max=h;
			}
		}

		// 出力
		System.out.println(count);
	}
}