
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String a[] = str.split(" ", 0);
		long b[] = new long[3];
		for(int i = 0; i < 3; i++ ){
			b[i] = Long.parseLong(a[i]);
		}
		if(b[0]%2 == 0 && b[1]%2 == 0 && b[2]%2 == 0){
			System.out.println("0");
		} else {
			BigDecimal bd[] = new BigDecimal[3];
			bd[0] = BigDecimal.valueOf(b[0]);
			bd[1] = BigDecimal.valueOf(b[1]);
			bd[2] = BigDecimal.valueOf(b[2]);
			if(b[0] >= b[1]){
				if(b[0] >= b[2]){
					BigDecimal ans =bd[1].multiply(bd[2]);
					System.out.println(ans);
				} else {
					BigDecimal ans =bd[1].multiply(bd[0]);
					System.out.println(ans);
				}
			} else {
				if(b[1] >= b[2]){
					BigDecimal ans =bd[0].multiply(bd[2]);
					System.out.println(ans);
				} else {
					BigDecimal ans =bd[1].multiply(bd[0]);
					System.out.println(ans);
				}
			}
		}
		
	}
}