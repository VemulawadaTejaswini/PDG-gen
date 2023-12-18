import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int X = Integer.parseInt(sc.next());
    	System.out.println(X == 3 || X == 5 || X == 7 ? "YES" : "NO");
    }
}
