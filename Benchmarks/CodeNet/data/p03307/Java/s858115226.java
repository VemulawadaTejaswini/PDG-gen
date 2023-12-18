import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans(n);
    }
    public static void ans(int n) {
        if(n%2 == 0) {
            System.out.println(n);
        }
        else {
            System.out.println(n*2);
        }
    }
}