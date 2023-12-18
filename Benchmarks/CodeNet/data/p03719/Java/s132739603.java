import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = br.readLine();

				String[] st = str.split(" ",0);
				int a =  Integer.parseInt(st[0]);
				int b = Integer.parseInt(st[1]);
				int c = Integer.parseInt(st[2]);
			if(c>=a && c<=b){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}catch(Exception ex){
			System.exit(0);
		}
	}
}