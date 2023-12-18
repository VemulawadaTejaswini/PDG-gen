import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main instance = new Main();
        instance.solve();
    }

    private void solve() {

            String s = sc.next();

            while(true) {
                if (s.endsWith("dream") || s.endsWith("erase")) {
                    s = s.substring(0, s.length()-5);
                } else if (s.endsWith("dreamer")) {
                    s = s.substring(0, s.length()-7);
                } else if (s.endsWith("eraser")) {
                    s = s.substring(0, s.length()-6);
                } else {
                    System.out.println("NO");
                    return;
                }

                if(s.length() == 0 ){
                    System.out.println("YES");
                    return;
                }
            }
    }
}