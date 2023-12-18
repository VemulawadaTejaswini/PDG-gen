package agc016;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		byte[] b;
		String s = in.next();
		try{
			int count = 0;
			b = s.getBytes("US-ASCII");
			int[] mojiCount = new int[26];
			char[] ochars = new char[s.length()];
			for(int i = 0; i < s.length(); i++){
				ochars[i] = s.charAt(i);
			}
			for(int i = 1; i < b.length-1;i++){
				if(b[i] != b[i+1])mojiCount[(int)b[i]-97]++;
			}
			int max = 1;
			int maxID = 0;
			ArrayList<Character> aaa = new ArrayList<Character>();
			for(int i = 0; i < mojiCount.length; i++){
				if(max < mojiCount[i]){
					max = mojiCount[i];
					maxID = i+97;
					aaa = new ArrayList<Character>();
					aaa.add(converter(maxID));
				}else if(max == mojiCount[i]){
					maxID = i + 97;
					aaa.add(converter(maxID));
				}
			}
			if(max == 1 && aaa.isEmpty()){
				count = 0;
			}else{
				int minCount = Integer.MAX_VALUE;
				for(Character c : aaa){
					char[] chars = ochars;
					int x = 0;
					do{
						char[] newChars = new char[chars.length-1];
						for(int i = 0; i < newChars.length; i++){
							if(chars[i+1] == c) newChars[i] = c;
							else newChars[i] = chars[i];
						}
						chars = newChars;
						x++;
					}while(isNotSame(c,chars));
					if(x < minCount) minCount = x;
				}
				count = minCount;
			}
			System.out.println(count);
		}catch(Exception e){
			e.printStackTrace();
		}
		in.close();
	}
	char converter(int n){
		byte[]bb = {(byte)n};
		try{
			char c = (new String(bb,"US-ASCII")).charAt(0);
			return c;
		}catch(Exception e){

		}
		return 'a';
	}
	boolean isNotSame(char c, char[] cs){
		for(char cc : cs){
			if(cc != c) return true;
		}
		return false;
	}

}
