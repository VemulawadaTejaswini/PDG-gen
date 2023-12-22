import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String m;
		char[] Arufa =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		char T = 't';
		char A = 'a';
		char ten = '.';
		char kuuhaku = ' ';
		int moziT = (int)T;
		int moziA = (int)A;
		
		while((m = br.readLine())!= null){
			char[] mozi = m.toCharArray();
			int code = (int)mozi[0];
			int sa = code - moziT;
			mozi[0] = Arufa[code-sa-moziA];
			System.out.print(mozi[0]);
			for(int i = 1 ; i < mozi.length ; i++){
				code =(int)mozi[i];
				if(code != kuuhaku && code != ten){
					if(code-sa >= moziA){
						mozi[i] = Arufa[code-sa-moziA];
					}else{
						//System.out.println(26+moziA-code + " " +Arufa[25] + " " + moziA + " " + code);
						mozi[i] = Arufa[(26-(moziA-(code-sa)))];
					}
				}
				System.out.print(mozi[i]);
			}
			System.out.println();
		}
	}
}