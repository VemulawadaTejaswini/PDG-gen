import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int size = a*b;
		int lap = a*2 + b*2;
		System.out.println(size + " " + lap);
    }
}
