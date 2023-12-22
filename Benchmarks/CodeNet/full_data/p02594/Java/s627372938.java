import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
        public static void main(String[]args){
            new Main().solve();
        }
    }