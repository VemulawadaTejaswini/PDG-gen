import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ST = br.readLine().split(" ") ; 
		int Sx = Integer.parseInt(ST[0]);
		int Sy = Integer.parseInt(ST[1]);
		int Tx = Integer.parseInt(ST[2]);
		int Ty = Integer.parseInt(ST[3]);
		
		String ans = "";
		//1往復目
		for(int firstR = 0; firstR<Tx-Sx; firstR++) {
			ans+="R";
		}
		for(int firstU = 0; firstU<Ty-Sy; firstU++) {
			ans+="U";
		}
		for(int firstL = 0; firstL<Tx-Sx; firstL++) {
			ans+="L";
		}
		for(int firstD = 0; firstD<Ty-Sy; firstD++) {
			ans+="D";
		}
		
		//2往復目
		ans+="D";
		for(int secondR = 0; secondR<Tx+1-Sx; secondR++) {
			ans+="R";
		}
		for(int secondU = 0; secondU<Ty+1-Sy; secondU++) {
			ans+="U";
		}
		ans += "L";
		ans += "U";
		for(int secondL = 0; secondL<Tx+1-Sx; secondL++) {
			ans+="L";
		}
		for(int secondD = 0; secondD<Ty+1-Sy; secondD++) {
			ans+="D";
		}
		ans+="R";
		
		System.out.println(ans);	
		
	}
}
