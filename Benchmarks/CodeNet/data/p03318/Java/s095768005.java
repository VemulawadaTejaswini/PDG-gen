import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long k = sc.nextLong();

		long count = 0;
		int number = 1;
		StringBuilder sb = new StringBuilder();
		while(true){
			if(count == k){
				return;
			}
			sb.insert(0,String.valueOf(number));
			System.out.println(sb.toString());
			sb.deleteCharAt(0);
			number++;
			count++;
			if(number == 10){
				number = 1;
				sb.append("9");
			}
		}



	}

}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

