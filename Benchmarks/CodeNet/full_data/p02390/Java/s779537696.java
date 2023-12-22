import java.util.*;

class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n % 60;
        int m = n / 60 % 60;
        int h = n / 3600;
        System.out.println(h + ":" + m + ":" + s);
    }
}
