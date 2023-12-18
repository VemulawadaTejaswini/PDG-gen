import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		String ans = "";

		int i = 0;
		while(k>0 && i<s.length()){
			int j = 26 - (s.charAt(i) - 'a');
			if(i==s.length()-1){
				int t = ((s.charAt(i)-'a') + k)%26;
				ans += (char)(t+'a');
			}else if(k>=j){
				ans += 'a';
				k -= j;
			}else{
				ans += s.charAt(i);
			}
			i++;
		}
		System.out.println(ans);
	}
}