import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		// スペース区切りの整数の入力
		int count = 0;
		int result = 0;
		for(int i=1;i<=a;i++){
			list.add(sc.nextInt());
			int samis =	list.get(i-1) - i;
			// System.out.println(samis);
			result = result + Math.abs(list.get(i-1) - i);
			if(samis<0){
				count++;
			}
		}
		if(count < a/2){
			System.out.println(result);

		}else{
			// System.out.println("多い"+count);
			result = 0;
			int b=0;
			int preResult = 0;
			while(count > a/2){
				preResult = result;
				result = 0;
				count = 0;
				// System.out.println("list");
				for(int i=1;i<=a;i++){
					int samis =	list.get(i-1) - i +b;
					// System.out.println(samis);
					result = result + Math.abs(samis);
					// System.out.println(samis);
					if(samis<0){
						count++;
					}
				}
				// System.out.println("list end");
				// System.out.println(b);
				// System.out.println(count);
				// System.out.println(result);
				b++;
			}
			// System.out.println("finish");
			// System.out.println(b);
			// System.out.println(count);
			System.out.println(Math.min(result,preResult));
		//bを足すごとに値が小さいなら結果が小さくなる
		// b=0のパターンなら、上記の値-iの合計値になる
			//-1-1-1-1-1-1とかだと足したくあんる
			//負のところが半分より少なくなったタイミングでおわり

		}
	}
}