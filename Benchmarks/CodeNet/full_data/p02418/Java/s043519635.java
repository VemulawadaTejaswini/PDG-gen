import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = br.readLine();
		int count = 0;

		char[] ch = str.toCharArray();
		char[] res = result.toCharArray();
		for(int i = 0; i < str.length(); i++){
			for(int j = 0; j < result.length(); j++){
				if(ch[i] == res[j]){
					count++;
				}

			}
		}
		if(count == result.length()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}