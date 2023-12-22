import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		String res = "";
		for(int i = 0; i < num; i++){
			String str = null;
			if((str = br.readLine()).compareTo(res) < 0){
				res = str;
			}
		}
		System.out.println(res);
	}
}