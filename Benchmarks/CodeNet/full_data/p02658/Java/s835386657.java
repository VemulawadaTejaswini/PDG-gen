import java.math.BigInteger;
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
 
	    //入力数字の数を入力
		Scanner sc=new Scanner(System.in);
 
	    int count=sc.nextInt();
	    long nyuryoku=0;
	    

		BigInteger result=BigInteger.ZERO;
		
		BigInteger max=BigInteger.valueOf((long)Math.pow(10, 18));
 
	    //入力処理
		for(int i=0;i<count;i++) {
			nyuryoku=sc.nextLong();
			if(result==BigInteger.ZERO) {
				result=result.add(BigInteger.valueOf(nyuryoku));
			}else {
				result=result.multiply(BigInteger.valueOf(nyuryoku));
			}
		}
	
		
		if(result.compareTo(max)==1) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
	}
}
