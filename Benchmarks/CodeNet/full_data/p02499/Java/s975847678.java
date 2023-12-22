import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] ch = new int[26];
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String line = in.nextLine();
			for(int i = 0; i < line.length(); i++){
				int tmp = Character.toLowerCase(line.charAt(i));
				if('a' <= tmp && tmp <= 'z')
					ch[tmp - 'a']++;
			}
		}
		for(char c = 'a' ; c <= 'z'; c++){
			System.out.println(c + " : " + ch[c - 'a']);
		}
	}
}