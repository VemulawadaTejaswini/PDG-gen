import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static String s;
	static long x;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		s = br.readLine();
		x = 0;
		
		for(int i=0; i<= s.length(); i++) f(i, 0, s);
		System.out.println(x);
	}
	
	static void f(int plus, long sum, String str){
		if(plus != 0){
			for(int i=1; i<str.length()-plus+1; i++){
				f(plus-1, Long.parseLong(str.substring(0, i))+sum, str.substring(i, str.length()));
			}
		}else{
			x += sum + Long.parseLong(str);
		}
	}
}
