import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=null,text="";
		int num=0;
		int alphabet[] = new int[26];

		try{
			while((str=br.readLine()) != null){
				text += str;
			}
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Error");
		}catch(NullPointerException w){
			w.printStackTrace();
		}

		char charArray[] = text.toCharArray();

		for(int i=0;i<charArray.length; i++){
			num = Character.toLowerCase(charArray[i]) - 'a';
			if(0<=num && num<=26){
				++alphabet[num];
			}
		}

		for(int j=0; j<26; j++){
			System.out.println((char)(j+'a') + " : " + alphabet[j]);
		}
	}
}