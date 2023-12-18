import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class atcoder {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=scn.nextLine();
		String ori=scn.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ori.charAt(i))
				count++;
		}
		System.out.println(count);
	}

}