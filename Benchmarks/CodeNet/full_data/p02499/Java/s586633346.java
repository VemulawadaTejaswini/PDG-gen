import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(sc.hasNextLine()){
			str += sc.nextLine();
		}
		sc.close();
		int[] nums = new int[26];
		for(char c : str.toLowerCase().toCharArray()){
			if('a' <= c && c <= 'z') nums[c - 'a']++;
		}
		for(int i = 0; i < 26; i++){
			System.out.println(String.format("%c : %d", 'a' + i, nums[i]));
		}
	}
}