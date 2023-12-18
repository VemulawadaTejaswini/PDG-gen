import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.nextInt();
        String g = sc.nextInt();
        String b = sc.nextInt();

        int number = Integer.parseInt(r + g + b);

        if (number % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}
}