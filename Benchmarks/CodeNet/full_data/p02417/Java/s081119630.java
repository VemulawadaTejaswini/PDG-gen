import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
					
		String str = br.readLine();
			
		char ch[] = str.toCharArray();
		char l = 'A';
		char s = 'a';
		
		int sum;
		for(int i = 0; i <= ('z' - 'a'); i++){
			sum = 0;
			for(int j = 0; j < ch.length; j++){
				if(ch[j] == l || ch[j] == s){
					sum++;
				}
			}
			System.out.println(s + " : " + sum);
			l++;
			s++;
		}
	}
}