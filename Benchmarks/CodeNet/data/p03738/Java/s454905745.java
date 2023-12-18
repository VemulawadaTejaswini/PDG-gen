import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int strN = 2; //文字列を何行受け取るか
		for(int i = 0; i < strN; i++){
			line += br.readLine() + " ";
		}
		String[] param = line.split(" ");
		BiggerInteger(param);
	}

	static void BiggerInteger(String[] param) {
		BigDecimal a = new BigDecimal(param[0]);
		BigDecimal b = new BigDecimal(param[1]);

		if( a.compareTo(b) == 1){
			System.out.println("GREATER");
		} else if (a.compareTo(b) == -1){
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}
	}

}