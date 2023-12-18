import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int a = Integer.valueOf(inputs[0]);
        int b = Integer.valueOf(inputs[1]);
        int k = Integer.valueOf(inputs[2]);
        int totalBet = b-a+1;
        if( totalBet<=2*k) {
            printAll(a,b);
            return;
        }
        printKSmallest(a,k);
        printKLargest(b,k);

    }

    private static void printAll(int a, int b) {
        for(int i = a; i<=b ; i++) {
            System.out.println(i);
        }
    }

    private static void printKSmallest(int a, int k) {
        for( int i = a; i<a+k; i++ ) {
            System.out.println(i);
        }
    }

    private static void printKLargest(int b,int k) {
        for ( int i = b - k +1; i<=b ; i++) {
            System.out.println(i);
        }
    }

}
