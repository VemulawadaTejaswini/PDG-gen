import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        byte[] X = scanner.next().getBytes();
        int ok = 0;
        if(X[0] == X[1]) ok++;
        if(X[0] == X[2]) ok++;
        if(X[0] == X[3]) ok++;
        if(X[1] == X[2]) ok++;
        if(X[1] == X[3]) ok++;
        if(X[2] == X[3]) ok++;

        if(ok == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}