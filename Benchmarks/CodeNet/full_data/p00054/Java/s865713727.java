import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String data = sc.nextLine();
			String[] adata = data.split(" ");
			BigDecimal divi;
			int n = Integer.parseInt(adata[2]);
			BigDecimal a = new BigDecimal(adata[0]).setScale(n+1);
			BigDecimal b = new BigDecimal(adata[1]).setScale(n+1);
			divi = a.divide(b,n+1,RoundingMode.HALF_UP);
			String str = divi.toString();
			String[] stra = str.split("\\.");
			String buf = stra[1];
			if(buf.length() < n){
				for(int i = 0 ; i < n ;i++){
					buf += "0";
				}
			}
			buf = buf.substring(0,n);
			String[] snum = buf.split("");
			int sum = 0;
			for(int i = 0 ; i < snum.length ; i++){
				sum += Integer.parseInt(snum[i]);
			}
			System.out.println(sum);
			
		}
		sc.close();
	}

}