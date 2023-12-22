import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] inputStr = br.readLine().toCharArray();
		int wordsNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < wordsNum ; i++){
			char[] pattern = br.readLine().toCharArray();
			int index = RKSearcher.indexOf(pattern, inputStr);
			if(index != -1){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}
	}

}

class RKSearcher {
	private static final long q = 1000000007L;
	private static final int d = 64;
	
	public static int indexOf(char[] str1, char[] str2){
		int M = str1.length;
		int N = str2.length;
		long dM = 1;
		long h1 = 0;
		long h2 = 0;
		
		//?????????????????°???????????????equals???????????°??????
		if(M == N){
			if(new String(str1).equals(new String(str2))){
				return 0;
			}
			else {
				return -1;
			}
		}
		
		else if (M > N){
			return -1;
		}
		
		for(int i = 1; i < M ; i++){
			dM = (d*dM)%q;
		}
		
		for(int i = 0; i < M; i++){
			h1 = (h1*d + index(str1[i])) % q;
			h2 = (h2*d + index(str2[i])) % q;
		}
		int i;
		for(i = 0; h1 != h2 ;i++){
			//System.out.println("i = "+i+" h1 "+h1+" h2 "+h2);
			h2 = (h2 + d*q - index(str2[i])*dM) % q;
			if(i+M >= N){
				return -1;
			}
			h2 = (h2*d + index(str2[i+M])) % q;
			if (i > N-M){
				return -1;
			}
		}
		return i;
	}
	
	private static int index(char c){
		//return c - '0' + 1;
		//??°??????0~9
		if(c >=  '0' && c <= '9'){
			return c - '0';
		}
		//?°??????????10~35
		else if (c >= 'a' && c <= 'z'){
			return c - 'a' + 10;
		}
		//??§?????????36~61
		else if (c >= 'A' && c <= 'Z'){
			return c - 'A' + 36;
		}
		else {
			return -1;
		}
	}
}