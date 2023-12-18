package ABC125;

import java.util.Scanner;

public class Main {
    public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        System.out.println((T / A) * B);
    }
}
