import java.util.Scanner;
class Main
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int len=s1.length();
		if(s1.charAt(len-1)=='s')
		{
			s1=s1.concat("es");
		}
		else
		{
			s1=s1.concat("s");
		}
		System.out.println(s1);
	}

}
