import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int K = sc.nextInt();
		int gu = 0;
		int ki = 0;
		if(K % 2 == 0){
			gu = K/2;
			ki = K/2;
		}else{
			gu = K/2;
			ki = K/2+1;
		}
		System.out.println(gu*ki);
		

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

