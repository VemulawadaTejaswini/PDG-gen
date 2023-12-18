import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		boolean judge = true;
		s.contains("a") ? s.replace("a", "") : judge = false;
		s.contains("b") ? s.replace("b", "") : judge = false;
		if(s.contains("c")){judge = false;}
		System.out.println(judge ? "YES" : "NO");
	}
}
