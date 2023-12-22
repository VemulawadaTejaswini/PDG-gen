import java.util.HashSet;
import java.util.Scanner;

class Main {

    static Scanner in = new Scanner(System.in);

    void solve() {
        int n = in.nextInt(); in.nextLine();
        HashSet<String> set = new HashSet<>();
        String[] ss = new String[n];
        for(int i = 0; i < n; i++) ss[i] = in.nextLine();
        for(String a:ss) {
            String[] s = a.split(" ");
            if(s[0].equals("insert")) set.add(s[1]);
            else System.out.println(set.contains(s[1]) ? "yes" : "no");
        }
    }



    public static void main(String[] args) {
        new Main().solve();
    }
}