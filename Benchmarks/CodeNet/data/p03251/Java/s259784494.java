import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		ArrayList<Integer> listX = new ArrayList<>();
		ArrayList<Integer> listY = new ArrayList<>();
		
		//xリストの最大値を求める
		for(int i=0; i<N; i++) {
			listX.add(sc.nextInt());
		}
		Integer maxX = Collections.max(listX);
		
		//yリストの最小値を求める
		for(int i=0; i<M; i++) {
			listY.add(sc.nextInt());
		}
		Integer minY = Collections.min(listY);
		
		//結果比較
		if((maxX < minY) && (maxX < Y-1) && (X+1 < minY)) {
			System.out.println("No War");
		}else{
			System.out.println("War");
		}
	}

}
