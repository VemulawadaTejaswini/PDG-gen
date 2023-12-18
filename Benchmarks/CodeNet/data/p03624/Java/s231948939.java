import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] alb = new int[26];
		for(int i = 0 ; i<input.length(); i++){
			alb[input.charAt(i)-'a']++;
		}
		for(int i = 0 ; i<26; i++){
			if(alb[i] == 0){
				System.out.println((char)(i+'a'));
				break;
			}
			else if(i == 25){
				System.out.println("None");
			}
		}
	//	System.out.println(Arrays.toString(alb));
	}
}
