import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = l%3;
        int h = l/3;
        int w = l/3;
        int x = l/3;
        if (r == 2) {
            h++;
            w++;
        } else if (r == 1){
            h++;
        }
        System.out.println(h*w*x);
    }
}
