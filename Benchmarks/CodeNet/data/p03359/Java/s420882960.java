import java.util.Scanner;

class Main{



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for(int i = 1; i<= a ;i++){
			for(int j = 1;j < 31;j++){
				if(i == j){
					ans++;
				}
				if(i == a && j >= b){
					System.out.println(ans);
					return;
				}
			}
		}


	}






}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



