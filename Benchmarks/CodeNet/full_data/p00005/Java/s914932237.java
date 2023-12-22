import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(true){
			long numA = stdIn.nextLong();
			long numB = stdIn.nextLong();
			long GCD = getGCD(numA,numB);				//最大公約数
			long LCM = getLCM(numA,numB);				//最小公倍数
			System.out.println(GCD + " " + LCM);
		}
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++
	//最大公約数(GCD)取得メソッド
	//++++++++++++++++++++++++++++++++++++++++++++++++++
	public static long getGCD(long numA,long numB){
		long GCD = 1L;
		if(numA == numB){
			GCD = numA;
		}else{
			if(numA > numB){
				long temp = numA;
				numA = numB;
				numB = temp;
			}
			long smallNum = numA;

			while(0 < smallNum){
				if(numA % smallNum == 0 && numB % smallNum == 0){
					GCD = smallNum;
					break;
				}
				smallNum--;
			}
		}
		return GCD;
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++
	//最小公倍数(LCM)取得メソッド
	//++++++++++++++++++++++++++++++++++++++++++++++++++
	public static long getLCM(long numA,long numB){
		long LCM = 0L;
		LCM = numA / getGCD(numA,numB) * numB;
		return LCM;
	}
}