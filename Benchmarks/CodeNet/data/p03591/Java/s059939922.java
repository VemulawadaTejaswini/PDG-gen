import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        String string  = in.nextLine();
        
        if(string.startsWith("YAKI")) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
