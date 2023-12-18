import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();

    	s = s.replaceAll("0", "");

    	System.out.println(s.length());

    }
}