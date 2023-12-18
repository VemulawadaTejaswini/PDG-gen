import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s = sc.next().toCharArray();
		int cnt[] = new int[26];
		
		for(char c:s){
			cnt[c-'a']++;
		}
		
		String ans = "None";
		
		for(int i=0;i<26;i++){
			if(cnt[i] == 0){
				ans = "" + (char)('a' + i);
				break;
			}
		}
		System.out.println(ans);
	}

}
