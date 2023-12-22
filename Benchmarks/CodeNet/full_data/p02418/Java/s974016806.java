import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
					
		String str, str2;
		
		char l;
		char s;
		
		int sum[] = new int[26];
		
		l = 'A';
		s = 'a';
			
		str = br.readLine();
		str2 = br.readLine();
		
		boolean flag = false;
		
		char ch[] = str.toCharArray();
		char ch2[] = str2.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(flag == true)break;
			for(int j = 0; j < ch2.length; j++){
				if(ch.length > i + j){
					if(ch2[j] != ch[i + j]){
						break;
					}
				}else{
					if(ch2[j] != ch[i + j - ch.length])break;
				}
				if(j == ch2.length - 1){
					flag = true;
				}
			}
		}
		if(flag == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}