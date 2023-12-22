import java.util.*;

class Main {

    static boolean isLeapYear (int year) {
        
        boolean result = false;

        if ( year % 4 == 0 ) {
            result = true;
            if ( year % 100 == 0 ) {
                result = false;
                if (year % 400 == 0) {
                    result = true;
                }
            }
        }
        
        return result;
    }

    static void solve (int a, int b) {
        boolean e = false;
        for(int y = a; y < b; y++) {
            if ( isLeapYear(y) ) {
                System.out.println(y);
                e = true;
            }
        }

        if (!e) System.out.println("NA");
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ( a == 0 && b == 0) break;

            solve(a, b);
            
            System.out.println("");
        }

    }
}