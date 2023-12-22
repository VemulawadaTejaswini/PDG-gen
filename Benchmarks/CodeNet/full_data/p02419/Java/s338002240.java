import java.util.Scanner;


public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int count = 0;

		while(true){
			String S = sc.nextLine();

			if(S.equals("END_OF_TEXT")){
				break;
			}

			String s = S.toLowerCase();
			sb.append(s);
		}

		String text = new String(sb);
		if(text.contains(word)){
			count++;
		}

		System.out.println(count);
	}
}