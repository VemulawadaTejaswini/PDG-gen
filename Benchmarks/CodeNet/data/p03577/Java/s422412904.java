import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        String string = in.nextLine();
//        if()
        System.out.println(string.substring(0,string.length() - 8));
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
