import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] dict = new boolean[(int) Math.pow(5, 12)];
		char[] c;
		for(int i = 0; i < n; ++i) {
			c = br.readLine().toCharArray();
			if(c[0] == 'i'){
				// insert
				dict[hash(Arrays.copyOfRange(c, 7, c.length))] = true;
			}else{
				// find
				if(dict[hash(Arrays.copyOfRange(c, 5, c.length))] == true){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
					
		}
	}
	public static int hash(char[] c){
		int a;
		int n = c.length;
		int hash = 0;
		for(int i = 0; i < n; ++i) {
			switch(c[n - i - 1]){
			case 'A':
				a = 1;
				break;
			case 'C':
				a = 2;
				break;
			case 'G':
				a = 3;
				break;
			default:
				a = 4;
				break;				
			}
			hash = hash*5 + a;
		}
		
		return hash;
		
	}
}