import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((y - (x * 2) >= 0) && (y - (x * 4) <= 0)) {
		System.out.println("Yes");
		return;
		}else{
		System.out.println("No");
		return;
		}
    }
}