import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// N

		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			numList.add(sc.nextInt());
		}

		// ソート
		Collections.sort(numList);

		// 奇数回ならAliceに加点。偶数回ならBobに加点
		int alice = 0;
		int bob = 0;

		for(int i = 0; i < n; i++){
			int point = numList.get(i);
			if(i%2 == 0){
				bob = bob + point;
			}else{
				alice = alice + point;
			}
		}

		// 出力
		System.out.println(alice - bob);
	}
}


