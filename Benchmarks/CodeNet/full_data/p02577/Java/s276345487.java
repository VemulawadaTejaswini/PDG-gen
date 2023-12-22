import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		String num = scn.next();
		int res = 0;
		for(char c:num.toCharArray())
		{
			int temp = (int)c-'0';
			res+=temp;
		}
		if(res%9==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
