import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t[][] = new int[N][3];

        for (int i = 0; i < t.length; i++) {
            t[i][0] = sc.nextInt();
            t[i][1] = sc.nextInt();
            t[i][2] = sc.nextInt();
        }

        boolean movable = true;

        for (int i = 0; i < t.length; i++) {
            
            if(!(t[i][0]%2 == (t[i][1] + t[i][2])%2)) {
                movable = false;
                break;
            }

            if(t[i][0] < (t[i][1] + t[i][2])) {
                movable = false;
                break;
            }

        }
        System.out.println(movable ? "YES" : "NO");
    }
}