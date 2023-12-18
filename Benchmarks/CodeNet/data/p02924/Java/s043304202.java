import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        long o=(n*(n-1))/2;
        System.out.println(o);
    }
}