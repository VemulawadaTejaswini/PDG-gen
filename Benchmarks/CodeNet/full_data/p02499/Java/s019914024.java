import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int counter[] = new int[26]; 
		for(int i=0; i<26; i++){
			counter[i]=0;
		}
		while(in.hasNext()){
			String line = in.next();
			char ch[] = line.toCharArray();
			for(int i=0; i<ch.length; i++){
				if(Character.isLetter(ch[i])){
					char tmp = Character.toUpperCase(ch[i]);
					counter[(int)tmp-65]++;
				}
			}
		}
		for(int i=0; i<26; i++){
			System.out.println((char)(97+i)+" : "+counter[i]);
		}
	}
}