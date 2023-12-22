//????????????????????????????¨?
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String serchWord = br.readLine().toLowerCase();
		
		int cnt = 0;
		boolean flg = true;
		String endWord ="end_of_text";
		
		while(flg){
			String[] sentence = br.readLine().toLowerCase().split(" ");		
			
			for(int i=0; i<sentence.length; i++) {
				if(sentence[i].contains(serchWord)) {
					cnt = cnt + 1;
				}
				else if(sentence[i].equals(endWord)) {
					flg = false;
				}
			}
		}
		System.out.println(cnt);
	}
}