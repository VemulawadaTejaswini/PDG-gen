import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long a[] = new long[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if (Arrays.asList(a).contains(0)){
//            if (Arrays.asList(a).())
            System.out.println("Yes");

        }
        else{
            if (a.length % 3 != 0) {
                System.out.println("No");
            }
            else {
                long count = 0;
                int i = 0;
                if (a.length == 3) {
                    if ((a[0] ^ a[2]) == a[1] && ((a[1] ^ a[0]) == a[2]) && ((a[2] ^ a[1]) == a[0]))
                        System.out.println("Yes");
                    else System.out.println("No");
                } else if ((a.length > 3) && (a[0] ^ a[2]) == a[1] && ((a[1] ^ a[0]) == a[2]) && ((a[2] ^ a[1]) == a[0])) {
                    while (i < n - 5) {
                        if ((a[i] == a[i + 3]) && (a[i + 1] == a[i + 4]) && (a[i + 2] == a[i + 5])) {
                            count++;
                            i += 3;
                        } else break;
                    }
                    if (count == (n / 3 - 1)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }

                } else {
                    System.out.println("No");
                }
            }
            }
        }
    }
}