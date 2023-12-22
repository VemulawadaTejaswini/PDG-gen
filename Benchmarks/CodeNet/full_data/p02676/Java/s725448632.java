import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.nextLine();
        int l = s.length();
        if (k >= l) {
          System.out.println(s);
        } else {
          String s1 = s.substring(0, k);
          System.out.println(s1 + "...");
        }
	}
}