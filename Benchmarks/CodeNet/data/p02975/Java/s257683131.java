import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if (a.length % 3 != 0) {
            System.out.println("No");
        } else {
            int count = 0;
            int i = 0;
            if ((a.length == 3) && (a[0] ^ a[2]) == a[1] && ((a[1] ^ a[0]) == a[2]) && ((a[2] ^ a[1]) == a[0])) {
                System.out.println("Yes");
            } else if ((a.length>3) && (a[0] ^ a[2]) == a[1] && ((a[1] ^ a[0]) == a[2]) && ((a[2] ^ a[1]) == a[0])){
                while (i < n - 5) {
                    if ((a[i] == a[i + 3]) && (a[i + 1] == a[i + 4]) && (a[i + 2] == a[i + 5])) {
                        count++;
                        i += 3;
                    }
                }
                if (count==(n/3-1)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

            }

        }
    }
}