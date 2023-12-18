import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String compare = "CODEFESTIVAL2016";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String compared = sc.nextLine();
		System.out.println(needtochange(compare,compared));
	}
	public static int needtochange(String s1,String s2)
	{
		int sum = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
				sum++;
		}
		return sum;
	}
}
