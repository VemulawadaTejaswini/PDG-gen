import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int k = scanner.nextInt();
	int a = scanner.nextInt(),b = scanner.nextInt(),y=0;
	
	for (int i=a;i<=b;i++) {
		if (i%k==0) {
			System.out.println("OK");
			y=1;
			break;
		}
	}
	if (y==0) System.out.println("NG");
	scanner.close();}}