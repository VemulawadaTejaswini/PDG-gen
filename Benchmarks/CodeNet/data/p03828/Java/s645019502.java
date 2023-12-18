import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static	int[] data;




	public static void main(String[] args) {





		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long pow = 1000000000+7;
		data = new int[1001];


		for(int i = 2;i <= n;i++){
			num(i);
		}

		ArrayList<Integer> adddata = new ArrayList<Integer>(); 
		for(int i = 2;i <= n;i++){
			if(data[i] > 0){
				adddata.add(data[i] + 1);
			}
		}

		long ans = 1;
		for(int i = 0; i < adddata.size();i++){
			ans *= adddata.get(i);
			ans %= pow;
		}
		System.out.println(ans);




	}



	static void num(int n){


		int num = n;
		for(int i = 1;i <= n;i++){
			if(n % i == 0){
				data[i]++;
				n /= i;
				i = 1;
			}
		}
		return;

	}
}


class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


