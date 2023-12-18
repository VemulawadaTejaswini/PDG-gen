import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//ufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		StringBuilder s = new StringBuilder(in.readLine());
		int num = 0;
		for(int i = 0; i< s.length()-1; i++) {
			if(i==0&&s.charAt(0) =='.'){continue;}
			if(s.charAt(i) == '#' &&  s.charAt(i+1) == '.') {
				num++;
				s=s.deleteCharAt(i+1);
				s=s.insert(i+1, '#');
			}
		}
		System.out.println(num);
	}
}