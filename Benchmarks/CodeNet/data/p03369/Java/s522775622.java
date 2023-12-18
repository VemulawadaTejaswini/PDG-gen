import java.util.Scanner;

class Main{



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
	String string = sc.next();
	int c = 0;
	for(int i = 0;i < 3;i++){
		if(		string.charAt(i) == 'o'){
			c++;
		}
	}
System.out.println(700+100*c);


	}

	static long comb(int n,int r){
		long ue = 1;
		for(int i = 0;i < r;i++){
			ue *= n-i;
		}
		long sita = 1;
		for(int i = 1;i <= r;i++){
			sita *= i;
		}
		return ue/sita;


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



