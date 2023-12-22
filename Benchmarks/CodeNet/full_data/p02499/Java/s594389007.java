import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args){
		new Main().count();
	}
	void count(){
		int[][] az = new int[26][2];
		String str = null;
		
		for(int i=0; i<26; i++){
			az[i][0] = 97 + i;
			az[i][1] = 0;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		char[] chars = str.toLowerCase().toCharArray();
		
		for(int i=0; i<chars.length; i++){
			for(int j=0; j<az.length; j++){
				if(az[j][0]==chars[i]){
					az[j][1]++;
				}
			}
		}
		
		for(int i=0; i<az.length; i++){
			char ch = (char) az[i][0];
			System.out.printf("%c : %d\n",ch,az[i][1]);
		}
	}
}