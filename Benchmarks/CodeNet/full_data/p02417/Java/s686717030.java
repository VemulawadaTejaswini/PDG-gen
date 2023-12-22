
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(sc.hasNext()){
			str += sc.nextLine();
		}
		char c = 'a';
		int[] a = new int[26];
		for(int i = 0; i < 26; i++){
			for(char x: str.toCharArray()){
				if(x == (char)(c + i) || x == (char)(c + i - 32)){
					a[i]++;
				}
			}

		}
		for(int i = 0; i < 26; i++){
			System.out.println((char)(c + i) + " : " + a[i]);
		}
	}
}


