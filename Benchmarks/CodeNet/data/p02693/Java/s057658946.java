import java.util.*;
public class Main {
	public static void main(String[] args){

		//変数K,A,Bの読み込み
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

	//AからBの中にKの倍数があるか1つずつ確かめる
		for(int i = A ; i <= B ; i++) {
		  if(i % K == 0) {
			  System.out.println("OK");
			  return ;  //Kの倍数があれば終わる
		  }
		}

	//Kの倍数がなければこっちの処理
		System.out.println("NG");
	}
}
