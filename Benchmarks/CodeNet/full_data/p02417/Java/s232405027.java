import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		String stdin = "";
		while(std.hasNextLine()){
			stdin += std.nextLine();
		}
		stdin = stdin.toLowerCase();

		int num[] = new int[26];
		for(int i=0; i<stdin.length(); i++){
			if(String.valueOf(stdin.charAt(i)).matches("[a-z]")){
				num[(stdin.charAt(i)-'a')]++;
			}
		}
		for(int j=0; j<26; j++){
			System.out.println((char)(j+'a') + " : "+num[j]);
		}
	}
}