import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力


		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a >= 13){
			System.out.println(b);
		}else if(6 <= a && a <= 12){
			System.out.println(b/2);
		}else{
			System.out.println(0);
		}
	}


	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


