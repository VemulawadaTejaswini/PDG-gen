import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x * 2 <= y) && (y <= x * 4) && (y % 2 == 0)) {
		System.out.println("Yes");
		}else{
		System.out.println("No");
		}
    }
}