import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		char[] abc = new char[26];
		for(char i = 'a';i <= 'z';i++) abc[i - 'a'] = i;

		int[] count = new int[26];

		Scanner sc = new Scanner(System.in);
		String input = "";
		while(sc.hasNext()){
			input += sc.nextLine().toLowerCase();
		}

		for(int i = 0;i < input.length();i++){
			if(input.charAt(i) - 'a' < 26 && 0 <= input.charAt(i) - 'a')
				count[input.charAt(i) - 'a']++;
		}

		for(int i = 0;i < 26;i++){
			System.out.println(abc[i] + " : " + count[i]);
		}

	}
}
