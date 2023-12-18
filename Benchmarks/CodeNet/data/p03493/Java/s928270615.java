import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();

    	String ans = s.replaceAll(s, "0");

    	System.out.println(ans.length());

    }
}