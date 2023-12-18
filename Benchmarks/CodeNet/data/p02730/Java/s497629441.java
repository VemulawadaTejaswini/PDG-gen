
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System .in));
		String input = br.readLine();
		int length = input.length();
		int mid = (length + 1)/2;

		String prefix = input.substring(0, mid - 1);
		String suffix = input.substring(mid);

		if(isKaibun(prefix) && isKaibun(suffix)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}


	public static boolean isKaibun(String input){
		int l = input.length();
		int mid = (l + 1) / 2;
		for(int i = 0; i < mid - 1 ; i++){
			if(input.charAt(i) != input.charAt(l - 1 - i)) return false;
		}
		return true;
	}
}
