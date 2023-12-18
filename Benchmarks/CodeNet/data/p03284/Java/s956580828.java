import java.util.Scanner;

public class Main {
	public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
int N, K, R;

N = keyboard.nextInt();
K = keyboard.nextInt();
R = N % K;

if (R == 0) {
System.out.println("0");
} else {
System.out.println("1");
}
keyboard.close();
}
}