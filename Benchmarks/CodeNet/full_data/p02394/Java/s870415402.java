import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    int w = s.nextInt();
    int h = s.nextInt();
    int x = s.nextInt();
    int y = s.nextInt();
    int r = s.nextInt();
    if (x + r > w)
      System.out.println("No");
    else if (x - r < 0)
      System.out.println("No");
    else if (y + r > h)
      System.out.println("No");
    else if (y - r < 0)
      System.out.println("No");
    else
      System.out.println("Yes");
	}
}

