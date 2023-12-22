import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			String[] s = str.split(" ");

			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);

			if((a == 0)&&(b == 0)){
				break;
			}else if(a < b){
				System.out.println(b +" "+a);
				continue;
			}else{
				System.out.println(a +" "+b);
				continue;
			}
		}
	}
}