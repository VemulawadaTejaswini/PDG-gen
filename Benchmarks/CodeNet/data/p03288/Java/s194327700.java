import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long c = sc.nextLong();

		if(c>=2800){
System.out.println("AGC");
		}else if(c>=1200){
System.out.println("ARC");

		}else{
System.out.println("ABC");

		}



	}


	public static boolean cIstrue(BigDecimal cc){
		BigDecimal forty = new BigDecimal("140");
		BigDecimal fseventy = new BigDecimal("170");
		int yon=cc.compareTo(forty);
		int nana=cc.compareTo(fseventy);

			// System.out.println("if140  "+yon);
			// System.out.println("if170  "+nana);
		if(yon==(-1)||yon==0){
			// System.out.println("goalFalse"+cc);
			return false;
		}
		if(nana==(-1)){
			// System.out.println("goalTrue"+cc);
			return true;
		}
		if(nana==(1)||nana==0){
			BigDecimal two = new BigDecimal("2");
			return cIstrue(cc.divide(two));
		}
		return false;
	}
}