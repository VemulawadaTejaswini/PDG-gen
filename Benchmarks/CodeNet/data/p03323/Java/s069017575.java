import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A<=8&&B<=8){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
    }
}