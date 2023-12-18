import java.util.Scanner;

public class MoveAndWin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean aliceTurn = true;
        if(Math.abs(a - b) == 1) {
            System.out.println("Borys");
            return;
        }

        while (Math.abs(a - b) != 1 && a < n && b < n) {
            if(aliceTurn) {
                a++;
                aliceTurn = false;
            }
            else {
                b++;
                aliceTurn = true;
            }
        }
        // TODO: this doesnt take into account that they can move left ?

        if(aliceTurn) {
            System.out.println("Borys");
        }
        else {
            System.out.println("Alice");
        }
    }

}
