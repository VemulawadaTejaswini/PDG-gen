import java.util.*;

public class main {
	public static void main(String[] args) {
		System.out.println("Hi");
		String s = "2017/01/00";
		Scanner scanner = new Scanner(System.in);
		s= scanner.next();
		String st = "2018/01/";
		
		System.out.println(st+s.substring(8));
		scanner.close();
	}

}