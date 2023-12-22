import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		str = str+str;
		String keyword = br.readLine();
		boolean result = false;

		for(int i =0; i < str.length();i++){
			int index  = str.indexOf(keyword.charAt(0),i);
			if(index == -1 || result)
				break;
			int keywordIndex=0;
			for(int j=index; j < str.length();j++){
				if(str.charAt(j)!=keyword.charAt(keywordIndex)){
					i = j - 1;
					break;
				}
				keywordIndex++;
				if(keywordIndex >= keyword.length()){
					result = true;
					break;
				}
			}
		}

		if(result){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}