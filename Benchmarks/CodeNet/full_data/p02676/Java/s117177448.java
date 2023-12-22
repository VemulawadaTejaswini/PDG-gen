import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		String s = in.next();
		if(s.length()>k){
          String new_s = s.substring(0,k);
		System.out.println(new_s + "...");
		}else{
			System.out.println(s);
		}
	}
}
