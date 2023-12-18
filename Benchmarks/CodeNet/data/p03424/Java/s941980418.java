import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for(int x=1;x<=n;x++) {
            if(sc.next().equals("Y")) {
                System.out.println("Four");
                return;
            }
        }
        System.out.println("Three");
    }
}
