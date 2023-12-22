import java.util.Scanner;

class Main{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int h = ss / 3600;
        int m = ss % 3600 / 60;
        int s = ss % 3600 % 60;
        System.out.printf("%d:%d:%d\n",h, m, s);
	}

}
