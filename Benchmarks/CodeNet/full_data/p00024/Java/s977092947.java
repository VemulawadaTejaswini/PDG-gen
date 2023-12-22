import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        Double d, v, y;
        int a;
        while (sc.hasNext()){
            d = sc.nextDouble();
            v = d/9.8;
            y = (v*v)*4.9;
            a = (int)Math.ceil((y+5)/5);
            System.out.println(a);
        }
    }
}