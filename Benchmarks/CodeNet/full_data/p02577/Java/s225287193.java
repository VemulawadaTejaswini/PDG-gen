import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += c - '0';
        }
		System.out.println((sum % 9 == 0) ? "Yes" : "No");
	}
}