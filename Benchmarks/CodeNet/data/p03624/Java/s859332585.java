import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc 	  = new Scanner(System.in);
		String 	string= sc.next();
		int[] count = new int[26];
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						  'o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] chars    = string.toCharArray();
		for(int i=0;i<chars.length;i++) 
			count[chars[i]-97] ++; 
		for(int i=0;i<count.length;i++)
			if(count[i]==0) { System.out.println(alphabet[i]); System.exit(1); }
		System.out.println("None");
	}

}
