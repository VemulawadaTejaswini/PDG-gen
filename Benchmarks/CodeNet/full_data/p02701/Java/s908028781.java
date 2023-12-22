import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		 HashSet<String> hs = new HashSet<>();
		 while(n-->0){
			 String s =scn.next();
			 hs.add(s);
		 }
		 System.out.println(hs.size());

	}

}