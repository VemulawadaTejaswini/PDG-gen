import java.io.*;

public class Main{
	static int digit(int a, int b){
		int x = a + b;
		int d = 0;
		while( x > 0 ){
			d++;
			x /= 10;
		}
		return d;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		final int NUM = 1000;
		String[] str = new String[NUM];
		String[][] s = new String[NUM][2];
		int[][] p = new int[NUM][2];
		int i = 0;
	
		while( (str[i] = stdIn.readLine()) != null ){
			str[i] = stdIn.readLine();
			s[i] = str[i].split(" ");
			p[i][0] = Integer.parseInt(s[i][0]);
			p[i][1] = Integer.parseInt(s[i][1]);
			i++;
		}
			
		for(int j = 0; j < i; j++){
			System.out.println(digit(p[j][0],p[j][1]));
		}
	}
}