import java.util.Scanner;

public class Main {
 static final int ADD      = 1;
 static final int MINUS    = 2;
 static final int MULTIPLY = 3;
 static final int DIVIDE   = 4;

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int count = in.nextInt();
	long n = 0, d = 1;
	for (int i = 0; i < count; i++) {
	 int op = in.nextInt();
	 long num = in.nextLong();
	 switch (op) {
	 case MINUS:
		num = -num;
	 case ADD:
		n = n + (d * num);
		break;
	 case MULTIPLY:
		if (num != 0 && d % num == 0) {
		 d = d / num;
		} else {
		 n = n * num;
		}
		break;
	 case DIVIDE:
		if (num != 0 && n % num == 0) {
		 n = n / num;
		}
		else {
		 d = d * num;
		}
		break;
	 }
	}
	System.out.println(n/d);
 }
}