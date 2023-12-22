import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		String abacus[] = new String[]{
			"* = ****",
			"* =* ***",
			"* =** **",
			"* =*** *",
			"* =**** ",
			" *= ****",
			" *=* ***",
			" *=** **",
			" *=*** *",
			" *=**** ",
		};
		boolean flag = false;
		while((string = reader.readLine()) != null){
			if(flag) System.out.println();
			else flag = true;
			
			while(string.length() < 5){
				string = "0" + string;
			}
			
			char ch[] = string.toCharArray();
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 5; j++){
					System.out.print(abacus[ch[j] - '0'].charAt(i));
				}
				if(i < 7) System.out.println();
			}
		}
		reader.close();
	}
}