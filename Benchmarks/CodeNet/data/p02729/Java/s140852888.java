import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        System.out.println(cmb(n)+cmb(m));
    }
    
    public static int cmb(int a) {
        if (a < 1){
            return 0;
        }
        return a*(a-1)/2;
    }
}
