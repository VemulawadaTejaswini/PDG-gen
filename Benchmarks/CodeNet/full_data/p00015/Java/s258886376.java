import java.util.Scanner;

public class Main{
	public static String calculate(String x, String y){
		StringBuilder ans = new StringBuilder();
		int sur = 0;
		int n = (x.length() > y.length()) ? y.length() : x.length();
		int m = (x.length() > y.length()) ? x.length() : y.length();
		for(int i = 0; i < n; i++){
			int a = Integer.parseInt(Character.toString(x.charAt(x.length()-i-1)));
			int b = Integer.parseInt(Character.toString(y.charAt(y.length()-i-1)));
			int p = (a+b+sur)%10;
			sur = (a+b+sur)/10;
			ans.append(String.valueOf(p));
		}
		String z = (x.length() > y.length()) ? x : y;
		for(int i = n; i < m; i++){
			int a = Integer.parseInt(Character.toString(z.charAt(z.length()-i-1)));
			int p = (a+sur)%10;
			sur = (a+sur)/10;
			ans.append(String.valueOf(p));
		}
		if( sur != 0 ){
			ans.append(sur);
		}
		String result = ans.reverse().toString();
		if( result.length() > 80 ){
			result = "overflow";
		}
		return result;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String[] result = new String[N];
		
		for(int i = 0; i < N; i++){
			String x = stdIn.next();
			String y = stdIn.next();
			result[i] = calculate(x, y);
		}
		for(int i = 0; i < N; i++){
			System.out.println(result[i]);
		}
	}
}