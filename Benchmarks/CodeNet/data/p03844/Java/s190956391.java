import java.util.Scanner;

class Main{




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		String x	 = sc.next();
		int m = sc.nextInt();
		if(x.equals("+")){
			System.out.println(n+m);
		}else{
			System.out.println(n-m);

		}



	}
}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


