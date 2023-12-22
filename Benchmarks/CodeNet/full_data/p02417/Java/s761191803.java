import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = "";
		while(stdIn.hasNext()) {
		s += stdIn.nextLine();
		}
		s = s.toLowerCase();
		int[] ans = new int[k.length];
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < k.length; j++) {
				if(s.charAt(i) == k[j]) {
					ans[j]++;
				}
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println(k[i]+" : " + ans[i]);
		}
	}
}