import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] ch = new int[26];
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String line = in.nextLine();
			for(int i = 0; i < line.length(); i++){
				System.out.println(Character.toLowerCase(line.charAt(i)));
				char tmp = Character.toLowerCase(line.charAt(i));
				if('a' <= tmp && tmp <= 'z')
					ch[tmp - 'a']++;
				else continue;
			}
		}
		for(int j = 0; j < 'z' - 'a'; j++){
			System.out.println((char)(j + 'a') + ":" + ch[c - 'a']);
		}
	}
}