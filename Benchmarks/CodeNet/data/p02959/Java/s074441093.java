import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < i+2; j++) {
                int diff = 0;
                if(a[j] < b[i]){
                    diff = a[j] ;
                }else{
                    diff = b[i];
                }
                a[j] -= diff;
                b[i] -= diff;
                ans += diff;
            }
        }

//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }

        System.out.println(ans);
        scanner.close();
    }
}
