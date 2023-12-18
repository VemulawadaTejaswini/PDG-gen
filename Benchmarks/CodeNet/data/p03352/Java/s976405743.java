import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			
			int X = sc.nextInt();
			if (X == 1){
			    System.out.println(1);
			    return ;
				
			}

			int ans = 0;
			int max = 0;
			double d = Math.sqrt(X);
			
			int wki = (int) Math.floor(d);
			
			for(int i = 2;i <= wki;i++){
				for(int j = 2;j <= wki;j++){
					ans = (int) Math.pow(i, j);
				    System.out.println(i);
				    System.out.println(j);
				    System.out.println(ans);
					if(X <= ans ) {
						j = wki;
					}else{
						if(max < ans){
							max = ans;
						}
					}
				}
			}
			
		    System.out.println(max);
		    return ;
		}
			
}
