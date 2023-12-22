import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt()){
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(LCM(a,b)+" "+GCD(a,b)); //公約数と公倍数を求めるメソッドは別に用意する
			} else { break; }
		}
	}
	static int GCD(int a, int b){
		int gcd =1;
		int gcdSup = Math.max(a, b); //aとbの大きい方
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
					aTimes += a;  //aの倍数がbの倍数に追い付くか抜くまでaをaずつ増やす
				}
				while(bTimes < aTimes){
					bTimes += b;  //bの倍数がaの倍数に追い付くか抜くまでbをbずつ増やす
				}
				if(aTimes==bTimes){
					lcm=aTimes;  //両方の倍数がイコールならそれが公倍数
					break;
				} else if (aTimes > 2000000000){
					break;
				}
		}
		return lcm;
	}
}