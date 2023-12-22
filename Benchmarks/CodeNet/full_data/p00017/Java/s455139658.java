import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String m = br.readLine();
		char[] mozi = m.toCharArray();
		char[] Arufa =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int code = (int)mozi[0];
		char T = 't';
		char A = 'a';
		char ten = '.';
		char kuuhaku = ' ';
		int mozia = (int)kuuhaku;
		int moziT = (int)T;
		int moziA = (int)A;
		int Ten = (int)ten;
		int sa = code - moziT;
		mozi[0] = Arufa[code-sa-moziA];
		System.out.print(mozi[0]);
		for(int i = 1 ; i < mozi.length ; i++){
			code =(int)mozi[i];
			if(code != kuuhaku && code != Ten){
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