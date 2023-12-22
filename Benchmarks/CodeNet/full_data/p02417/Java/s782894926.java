package Character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character;
import java.util.Scanner;


public class C {
	private static final String Charcter = null;

	/**
	 * main
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int[] cnt = new int[26];//??¢??????????????????26??????????????????
		int num = 0;		//???????????¨????????°
		String line = "";
		
		while(scan.hasNext()){
			
			for(char c : line.toCharArray()){
				c = Character.toLowerCase(c);
				if(c < 'a' && c > 'z'){
					num = c - 'a';
					cnt[num]++;
				}
			}
		}
		
		//??¨???
		for (int i = 0; i < cnt.length; i++) {
			System.out.println((char)('a'+i) + " : " + cnt[i]);
		}
	}

	

	
}

//if(c < 'a' || c > 'z'){
//c = Charcter.toLowerCase(c);