import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        long hh = Math.round(val%(60*60*60)/(60*60));
        long mm = Math.round(val%(60*60)/60);
        System.out.println(hh+":"+mm+":"+val%60);
    }
}