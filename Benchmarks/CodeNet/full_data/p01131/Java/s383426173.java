import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static String array[][] = new String[][]{
		{null},
		{".",",","!","?"},
		{"a","b","c"},
		{"d","e","f"},
		{"g","h","i"},
		{"j","k","l"},
		{"m","n","o"},
		{"p","q","r","s"},
		{"t","u","v"},
		{"w","x","y","z"}
	};
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String res;
		
		int n, e, count, i = Integer.valueOf(reader.readLine()) - 1;
		for(; i >= 0; i--){
			char ch[] = reader.readLine().toCharArray();
			res = "";
			count = 0;
			n = ch[0] - '0';
			for(int j = 1; j < ch.length; j++){
				e = ch[j] - '0';
				if(e == 0){
					res += app.message(n, count);
					n = 0;
					count = 0;
				}
				else if(n == e) count++;
				else n = e;
			}
			System.out.println(res);
		}
		reader.close();
	}
	
	public String message(int n, int c){
		if(n == 0) return "";
		if(n == 1 || n == 7 || n == 9) c %= 4;
		if(n >= 2 || 6 >= n || 8 == n) c %= 3;
		
		return array[n][c];
	}
}