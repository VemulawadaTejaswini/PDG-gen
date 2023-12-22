import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static String ango;
	static ArrayList<String> kouho;
	
	private static void check(char[] text)
	{
		char[] buf = new char[ango.length()];
		for(int j = 0;j < ango.length();j++) buf[j] = text[j];
		
		char[] tmp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for(int i = 1;i < 26;i++)
		{
			for(int j = 0;j < ango.length();j++)
			{
				if(buf[j] == tmp[i])
				{
					buf[j] = tmp[i-1];
					break;
				}
			}
		}
		
		String making = String.valueOf(buf);
		if(ango.equals(making)) kouho.add(String.valueOf(text));
	}
	
	private static void dfs(char[] text, int num)
	{
		if(num == ango.length())
		{
			check(text);
		}
		else
		{
			char c = ango.charAt(num);
			
			text[num] = c;
			dfs(text, num+1);
			
			if(c != 'z')
			{
				text[num] = (char)((int)c + 1);
				dfs(text, num+1);
			}
		}
	}
	
	private static void start()
	{
		kouho = new ArrayList<String>();
		char[] text = new char[ango.length()];
		dfs(text, 0);
		
		System.out.println(kouho.size());
		
		if(kouho.size() <= 10)
		{
			for(String s : kouho)
			{
				System.out.println(s);
			}
		}
		else
		{
			System.out.println(kouho.get(0));
			System.out.println(kouho.get(1));
			System.out.println(kouho.get(2));
			System.out.println(kouho.get(3));
			System.out.println(kouho.get(4));
			
			System.out.println(kouho.get(kouho.size()-5));
			System.out.println(kouho.get(kouho.size()-4));
			System.out.println(kouho.get(kouho.size()-3));
			System.out.println(kouho.get(kouho.size()-2));
			System.out.println(kouho.get(kouho.size()-1));
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			ango = sca.next();
			
			if(ango.equals("#")) break;
			
			start();
		}
	}
}