import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int count = 0;
		while(true){
			String req = br.readLine();
			String [] s = req.split(" ");
			if(req.endsWith("END_OF_TEXT")){
				break;
			}
			for(int i = 0; i < s.length; i++){
				if(str.indexOf(s[i]) != -1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}