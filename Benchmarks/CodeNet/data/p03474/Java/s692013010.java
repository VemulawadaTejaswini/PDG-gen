import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b;
		String str;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		str = sc.next();
		int len = str.length();
		boolean tf = true;
		for (int i = 0;i < len;++i)
		{
			if (i < a && !Character.isDigit(str.charAt(i))) tf = false;
			else if (i == a && str.charAt(i) != '-') tf = false;
			else if (i > a && !Character.isDigit(str.charAt(i))) tf = false;
		}
		if (a+b+1 != len) tf = false;
		if (tf) System.out.println("Yes");
		else System.out.println("No");
	}

}
