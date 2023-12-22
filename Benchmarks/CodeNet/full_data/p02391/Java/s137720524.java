
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws Exception {
		BufferedReader aInput = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(aInput.readLine());
		int a = Integer.parseInt(tk.nextToken());
		int b = Integer.parseInt(tk.nextToken());
		calcComparison calc = new calcComparison(a,b);
	}
}

class calcComparison{
	public calcComparison(int Num1,int Num2){
		if( Num1 < Num2 ){
			System.out.println("a < b");
		}
		else if( Num1 > Num2 ){
			System.out.println("a > b");
		}
		else{
			System.out.println("a == b");
		}
	}
}

