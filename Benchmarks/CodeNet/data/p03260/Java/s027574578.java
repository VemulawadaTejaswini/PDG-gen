import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println(A%2 == 1 && B%2 == 1?"Yes": "No");
//        Task tsk = new Task();
//        tsk.solve();
    }

    static class Task{
        public void solve(){
        }
    }
}
