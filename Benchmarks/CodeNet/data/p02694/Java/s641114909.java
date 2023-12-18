import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	long x = scanner.nextLong();
	long n = 100;
	int i=0;
	while (n<x) {
		i++;
		n+=n/100;
	}
	System.out.println(i);
	scanner.close();}}