
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int sum =0;
		int gcdWork=0;
		int gcd =0;
		
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=k;j++) {
				for(int m=1;m<=k;m++) {
					Gcd g1 = new Gcd(i,j);
					gcdWork=g1.gcdCalc();
					Gcd g2 = new Gcd(gcdWork,m);
					gcd=g2.gcdCalc();
					sum+=gcd;
				}
			}
		}
		System.out.println(sum);
	}

}


class Gcd {
	int targetA;
	int targetB;
	static int[] targetArray;
	
	public Gcd(int targetNumberA ,int targetNumberB) {
		this.targetA=targetNumberA;
		this.targetB=targetNumberB;
		this.targetArray = new int[2];
		targetArray[0] =targetA;
		targetArray[1] =targetB;
	}
	
	////最大公約数ユークリッドの互除法(int[A,B] )(return int)
	public static int gcdCalc(){
         int x;
         int y;
        if (targetArray[0] > targetArray[1]) {
            x = targetArray[0];
            y = targetArray[1];
        } else {
            x = targetArray[1];
            y = targetArray[0];
        }
        // ここからがユークリッドの互除法を用いた最大公約数を
        // 求める為の式
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return(y);
    }
	
//////最小公倍数(int[A,B] int )(return int)
	////gcdをgcdCalcで求めて代入
	public static int lcmCalc(int gcd) {
        int x;
        int y;
       if (targetArray[0] > targetArray[1]) {
           x = targetArray[0];
           y = targetArray[1];
       } else {
           x = targetArray[1];
           y = targetArray[0];
       }
       int lcm = (x*y)/gcd;
       return(lcm);
	}
	

}


