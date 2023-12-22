import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] chars = new int[256];
		while(true){
			int x = 0;
			String line = sc.nextLine();
			for(int i = 0;i < line.length();i++){
				char ch = Character.toLowerCase(line.charAt(i));
				chars[ch]++;
				if(ch == '.') x = 1;
			}
			if(x == 1) break;
		}
		for(char ch = 'a';ch<='z';ch++){
			System.out.println(ch + " : " + chars[ch]);
		}
	}
}