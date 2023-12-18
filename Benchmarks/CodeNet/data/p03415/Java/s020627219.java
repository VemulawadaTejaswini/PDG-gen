import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        for(int i = 0; i < 3; i++){
            System.out.println(in.nextLine().charAt(i));
        }
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}
