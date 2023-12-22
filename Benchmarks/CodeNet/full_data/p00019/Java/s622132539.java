import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	public static long fact(int n){
		if(n==0)return 1;
		//if(n==1)return 1;
		//if(n==2)return 2;
		//if(n==3)return 6;
		//といった具合に計算結果を保存しておけばメモ化
		return  n*fact(n-1);
	}
	}
