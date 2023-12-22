import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();

        int out = 0;

        for (int i=0; i < N; i++){
            int a = scan.nextInt();
            if (i %2 == 1 && a % 2 == 1){
                out ++;
            }
        }
        System.out.println(out);
    }
}
