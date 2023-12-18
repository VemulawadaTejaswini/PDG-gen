import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int start = M*2;
        for (int i = 0; i < M ; i++) {
            System.out.println(i+1+ " "+start);
            start--;
        }
    }
}

