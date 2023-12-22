	import java.util.Scanner;
public class main {
    public static void main(String args[] )  {
			Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int hour = a / 3600;
            int	b = a % 3600;
            int min = b / 60;
            int sec = b % 60;
            System.out.printf("%d:%d:%d%n",hour,min,sec);
        }
	}