import java.util.*;

public class Main{
	public static void main(String[] args){
		int i,count;
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split("[ ,\\.]");

		for(i=count=0;i<s.length;i++){
			if(3 <= s[i].length() && s[i].length() <= 6){
				if(count != 0) System.out.print(" ");
				System.out.print(s[i]);
				count++;
			}
		}
		System.out.println();
	}
}