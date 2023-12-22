import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.nextLine();
		int num;
		int counter[] = new int[26];
		char c[] = new char[s.length()+1];
		c = s.toCharArray();
		for(int i=0; i<s.length(); i++){
			num = Character.toLowerCase(c[i])-'a';
			if(!(num<0)) counter[num]++;
		}
		for(int i=0; i<26; i++){
			System.out.println((char)(i+'a')+" "+ ": "+ counter[i]);
		}
	}
}