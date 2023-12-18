import java.util.*;

public class P100B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int output = 0;
        switch (d) {
            case 0:
                output = 1;
                break;
            case 1:
                output = 100;
                break;
            case 2:
                output = 10000;
                break;
        }

        System.out.println(output*n);
    }
}