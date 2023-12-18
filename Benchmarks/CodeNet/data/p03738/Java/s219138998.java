import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		long a = Long.parseLong(param[0]);
		long b = Long.parseLong(param[1]);

		if( a > b ){
			System.out.println("GREATER");
		} else if (a < b){
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}
	}

}