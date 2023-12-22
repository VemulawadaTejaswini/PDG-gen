import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt()){	//EOFについたらifが成り立たずbreakする
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(GCD(a,b)+" "+LCM(a,b)); //公約数と公倍数を求めるメソッドは別に用意する
			} else { break; }
		}
	}
	static int GCD(int a, int b){
		int gcd =1;
		if(a==b){
			return a;
		}
		int gcdSup = Math.max(a, b)/2; //aとbの大きい方の半分
		for(int i=2; i<=gcdSup; i++){
			if(a%i==0){		//iがaの因数である場合
				if(b%i==0){  //iがbの因数である場合
					gcd = i; //iを新しい公約数として更新
				}
			}
		}
		return gcd;
	}
	static int LCM(int a, int b){
		int lcm = -1;
		int aTimes = a;
		int bTimes = b;
		while(true){
				while(aTimes < bTimes){
					aTimes = aTimes + a * ((bTimes - aTimes)/a) ;  //aの倍数がbの倍数に追い付くか抜くまで増やす
					if(aTimes==bTimes){
						return aTimes;
					} else { aTimes += a; }	//これをするとaの倍数がbの倍数を超える
				}
				while(bTimes < aTimes){
					bTimes = bTimes + b * ((aTimes - bTimes)/b);  //bの倍数がaの倍数に追い付くか抜くまで増やす
					if(aTimes==bTimes){
						return aTimes;
					} else { bTimes += b; }
				}
				if (aTimes == bTimes){ return aTimes;}
				if (aTimes > 2000000000){
					break;
				}
		}
		return lcm;
	}
}