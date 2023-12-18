import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b  =sc.nextInt();
		
		int ans = 0;
		if(a > b){
			ans = a+a-1;
		}else if(b > a){
			ans = 2*b-1;
		}else{
			ans = 2 * a;
		}
		System.out.print(ans);
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


