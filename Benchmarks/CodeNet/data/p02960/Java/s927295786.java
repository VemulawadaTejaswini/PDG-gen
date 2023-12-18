
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		s.toCharArray();
		int keta = s.length();
		int[][] keta_amari = new int [keta][13];
		if (s.charAt(keta-1) == '?') {
			for (int i = 0 ; i < 9; i ++) {
				keta_amari[0][i] ++;
			}
		}else {
			//System.out.println(Character.getNumericValue(s.charAt(keta -1)));
			keta_amari[0][Character.getNumericValue(s.charAt(keta -1))%13] ++;
		}
		
		for (int k = 2 ; k <=keta ; k ++) {
			if(s.charAt(keta -k) != '?') {
				int l  = Character.getNumericValue(s.charAt(keta -k)); 
				int temp = (int) ((l*Math.pow(10, k-1))%13);
				for (int i = 0 ; i < 13 ;i ++) {
					keta_amari[k-1][i] = keta_amari[k-2][((13-temp) +i)%13];
					//System.out.println(((13-temp) +i)%13);
				}
			}else {
				int list[] = {0,1,2,3,4,5,6,7,8,9};
				for (int l: list) {
					int temp = (int) ((l*Math.pow(10, k-1))%13);
					for (int i = 0 ; i < 13 ;i ++) {
						keta_amari[k-1][i] += keta_amari[k-2][((13-temp) +i)%13];
						//System.out.println(((13-temp) +i)%13);
					}	
				}
			}
		}
		
		System.out.println((keta_amari[keta-1][5])%1000000007);	
	}
}
