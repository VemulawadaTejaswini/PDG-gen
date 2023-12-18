import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();

		//初期位置から最も近い点との距離の公約数かつ、各座標間の距離の最小値

		List<Integer> positionList = new ArrayList<>();
		positionList.add(x);

		for(int i=0;i<n;i++){
		int c = sc.nextInt();
		positionList.add(c);
		}

		Collections.sort(positionList);

		List<Integer> lengthList = new ArrayList<>();

		for(int i=1;i<positionList.size();i++){
			int length = Math.abs(positionList.get(i)-positionList.get(i-1));
			lengthList.add(length);
		}
		Collections.sort(lengthList);

		// System.out.println(lengthList);

		int minGCD =Integer.MAX_VALUE;
		for(int i=1;i<lengthList.size();i++){
			int gcd = gcd(lengthList.get(i),lengthList.get(i-1));
		// System.out.println(gcd);
			minGCD =  Math.min(minGCD, gcd);
		}
		if(lengthList.size()==1){
			minGCD=lengthList.get(0);
		}
		System.out.println(minGCD);

	}
static int gcd (int a, int b) {
	int temp;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
}
}


