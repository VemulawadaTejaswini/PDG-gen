import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{

		char[][] x = new char[3][100];
		String[] s = new String[3];
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		s[0] = in.readLine();
		s[1] = in.readLine();
		s[2] = in.readLine();
		
		int i, j;
		for(i=0; i<3; i++){
			for(j=0; j<s[i].length(); j++){
				x[i][j] = (s[i].charAt(j));
			}
		}
		
		char win = 'a';
		int t = 0;
		int[] card = new int[3];
		while(true){
			
			if(x[t][card[t]] == 'a'){
				card[t]++;
				t = 0;
			}else if(x[t][card[t]] == 'b'){
				card[t]++;
				t = 1;
			}else if(x[t][card[t]] == 'c'){
				card[t]++;
				t = 2;
			} else {
				if(t == 0) win = 'A';
				if(t == 1) win = 'B';
				if(t == 2) win = 'C';
				break;
			}
		}
		System.out.println(win);
	}
}
