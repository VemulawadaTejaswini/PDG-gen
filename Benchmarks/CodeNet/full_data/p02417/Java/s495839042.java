import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();
		char [] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for(int i = 0; i < 26; i++){
			int cnt = 0;
			for(int j = 0; j < sent.length(); j++){
				char c = sent.charAt(j);
				if(alp[i] == c){
					cnt++;
				}
			}
			System.out.printf("%s:%d\n", alp[i], cnt);
		}
	}
}