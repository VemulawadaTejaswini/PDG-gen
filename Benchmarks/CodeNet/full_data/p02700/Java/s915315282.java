import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();// taka kou
        int B = scanner.nextInt();
        int C = scanner.nextInt();// ao kou
        int D = scanner.nextInt();
        while(true){
            C -= B;
            if(C <= 0 ){
                System.out.println("Yes");
                return;
            }
            A -= D;
            if(A <= 0 ){
                System.out.println("No");
                return;
            }
        }
    }
}
