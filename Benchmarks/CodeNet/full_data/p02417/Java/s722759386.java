import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int[] cnt= new int[26];
		char cr ;


		for(;;){
			String input = br.readLine();
			String lowerinput = input.toLowerCase();

			for(int i=0;i<lowerinput.length();i++){
				cr = lowerinput.charAt(i);
				if('a'<=cr && cr<='z'){
					cnt[cr-'a']++;
				}
			}	
			cr='a';
			for(int i=0;i<26;i++){
				System.out.println(cr++ +" : "+ cnt[i]);
			}
			
			for(int i=0;i<26;i++){
				cnt[i]=0;
			}

		}

		//??????

	}
}