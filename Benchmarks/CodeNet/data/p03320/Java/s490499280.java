import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = Integer.parseInt(readLine());
		int l=0;
		for(long i=1;l<k;i++){
			if(isSnuke(i)){
				System.out.println(i);
				l++;
			}
		}
		return;
	}
	
	private static boolean isSnuke(long n){
		double n_n = (double)n/getIntFromString(n+"");
		long m =Integer.parseInt((n+"").substring(0, 1));
		int digit = (n+"").toCharArray().length;
		for(int i=0;i<digit-1;i++){
			m=9+m*10;
		}
		if(n_n>(double)m/getIntFromString(m+"")){
			return false;
		}
		return true;
	}
	
	private static long getIntFromString(String s){
		long num = 0;
		char[] chars = s.toCharArray();
		for(int i=0;i<chars.length;i++){
			num+=Integer.parseInt(chars[i]+"");
		}
		return num;
	}

	private static String readLine(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}
