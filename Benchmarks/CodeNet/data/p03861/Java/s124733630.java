import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を3つ入力してください");
		String[] line = br.readLine().split(" ");

		long a = Long.parseLong(line[0]);
		long b = Long.parseLong(line[1]);
		long x = Long.parseLong(line[2]);

		if(a%x!=0){
			System.out.println(b/x-a/x);
		}
		else{
			System.out.println(b/x-a/x+1);
		}
	}
}
