import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    String f;
    int result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        f = sc.next();
        result = 0;
    }

    private void solve() {
        if (f.equals("RRR")) {
            result = 3;
        } else if (f.equals("SRR") || f.equals("RRS")) {
            result = 2;
        } else if (f.contains("R")) {
            result = 1;
        } else {
            result = 0;
        }
    }

    private void output() {
        System.out.println(result);
    }
}
