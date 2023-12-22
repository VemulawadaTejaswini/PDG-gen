import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		char a = 'a';
		int[] sum = new int[26];
		for(int i = 0; i < c.length; i++){
			if(c[i] >= 'A' && c[i] <= 'Z'){
				sum[c[i] - 'A']++;
			}else if(c[i] >= 'a' && c[i] <= 'z'){
				sum[c[i] - 'a']++;
			}
		}
		for(int i = 0; i < 26; i++){
			System.out.println(a++ + " : " + sum[i]);
		}

	}
}