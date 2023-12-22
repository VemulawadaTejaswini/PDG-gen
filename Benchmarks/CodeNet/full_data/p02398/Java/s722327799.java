import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");

		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);

		int count = 0;
		if((0 < a) && (0 < b) && (0 < c) && (a <= 10000) && ( b <= 10000) && (c <= 10000)){
			while(a <= b){
				if((c % a)== 0){
					count++;
					a++;
				}else{
					a++;
				}
			}
			System.out.println(count);
		}
	}
}