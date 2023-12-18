import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int ans = 0;
        if ((a * b)%2 == 0) {
            ans = (a * b)/2;
        } else {
            ans = (a * b)/2 + 1;
        }
        System.out.println(ans);
    }
}