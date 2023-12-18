import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();

			double k;
			for (int i = N ; i >  0. ; i--){
				k=Math.sqrt(i);
				if (Math.round(k) == k){
				    System.out.println(i);
					return;
				}
			}
		}
}
