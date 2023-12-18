import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		int p = 0;
out:		for(int i = 0; i < str.length; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if(str[i] == str[j]) {
					System.out.println("no");
					p = 1;
					break out;
				}
			}
			
		}
		if(p == 0) System.out.println("yes");
	}

}
