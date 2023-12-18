import java.util.Scanner;

public class Q1{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String w = "SUNMONTUEWEDTHUFRISAT";
        String s = scanner.next();
        int i = w.indexOf(s) / 3;
        System.out.println(7 - i);
    }
}
