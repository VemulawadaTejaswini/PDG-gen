import java.util.Scanner;
class SearchString{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String s1 = stdIn.next();
		String s2 = "AtCoder";
		if (s1.equals(s2))
		System.out.println("AC");
		else 
		System.out.println("WA");
	}
}