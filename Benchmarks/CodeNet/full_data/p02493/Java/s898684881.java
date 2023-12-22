import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int [] seq = new int [length];

        for (int x = 0; x < length; x++) {
            seq[x] = sc.nextInt();
        }

        System.out.print( seq[length-1] );
        for (int x = length - 2; x >= 0; x--) {
            System.out.print(" ");
            System.out.print( seq[x] );
        }
        System.out.print("\n");
    }
}