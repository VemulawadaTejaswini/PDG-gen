import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int lar = 0 ; int sma = 0;
			String num = sc.nextLine();
			if("0000".equals(num)) break;
			String[] str = num.split("");
			int[] strn = new int[4];
			
			for(int i = 0 ; i < str.length ; i++){
				strn[i] = Integer.parseInt(str[i]);
			}
			if(Integer.parseInt(num) % 1111 == 0){
				System.out.println("NA");
			} else {
				int count = 0;
				while(true){
					Arrays.sort(strn);
					sma =Integer.parseInt("" + strn[0] + strn[1] + strn[2] + strn[3] );
					lar =Integer.parseInt("" + strn[3] + strn[2] + strn[1] + strn[0] );
					if(lar - sma == 6174) {
						if(count != 0) count++;
						break;
					}
					count++;
					num = lar - sma + "";
					str = num.split("");
					strn = new int[4];
					
					for(int i = 0 ; i < str.length ; i++){
						strn[i] = Integer.parseInt(str[i]);
					}
				}
				System.out.println(count);
			}
 		}
		sc.close();
	}
}