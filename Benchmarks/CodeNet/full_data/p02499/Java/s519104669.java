import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] alfaCount = new int[26];
		String input; char alfaInd;
		
		while(in.hasNextLine()){
			input = in.nextLine();
		
			for(int i=0;i<input.length();i++){
				alfaInd = input.charAt(i);
				if('A'<=alfaInd && alfaInd<='Z') alfaCount[(int)alfaInd - 65]++;
				if('a'<=alfaInd && alfaInd<='z') alfaCount[(int)alfaInd - 97]++;
			}
		}
		
		for(int i=0;i<26;i++) System.out.println((char)(i+97)+" : "+alfaCount[i]);
	}
}