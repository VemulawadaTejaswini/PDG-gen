import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] abc = new int[26];
		char cha = 'a';
		for(int i = 0;i < 26;i++){
			abc[i] = cha;
			cha++;
		}

		int[] chars = new int[26];
		for(int i = 0;i < 26;i++) chars[i] = 0;

		while(sc.hasNextLine()){
			String line = sc.nextLine();

			for(int i = 0;i < line.length();i++){
				char ch = Character.toLowerCase(line.charAt(i));
				for(int j = 0;j < 26;j++){
					if(abc[j] == ch){
						chars[j] = chars[j] + 1;
						break;
					}
				}
			}
		}

		cha = 'a';
		for(int i = 0;i < 26;i++){
		 	System.out.println(cha + " : " + chars[i]);
		 	cha++;
		}
	}
}