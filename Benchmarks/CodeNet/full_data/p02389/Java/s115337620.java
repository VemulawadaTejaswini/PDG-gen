import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input1 = scan.next();
	int a = Integer.parseInt(input1);
	String input2 = scan.next();
	int b = Integer.parseInt(input2);
	int area = a * b;
	int length = (a + b) * 2;
	System.out.println(area + " " + length);
    }
}