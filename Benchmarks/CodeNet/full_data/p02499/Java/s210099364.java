import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] con = new int[35];
		int[] arf = new int[35];
		
		do {
			String str = input.nextLine();
			
			for (char c : str.toCharArray()){
				if (c >= 'a' && c <= 'z') con[c - 'a']++;
				else if (c >= 'A' && c <= 'Z') con[c - 'A']++;
			}
		}while (input.hasNext());
		
		for (int i = 'a'; i < 'z'; i++){
			System.out.println((char)i + " : " + con[(char)i - 'a']);
		}
	}
}