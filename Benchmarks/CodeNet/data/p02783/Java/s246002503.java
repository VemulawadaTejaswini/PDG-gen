import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int res = h / a;
        if(h % a > 0) res++;
        System.out.println(res);

    }

}
