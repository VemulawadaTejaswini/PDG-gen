import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        while(!(n == 0 && r == 0)){
            int[] a = new int[50];
            for(int i = 0; i < n; i++)
                a[n - i - 1] = i + 1;

            int[] b = new int[50];
            for(int i = 0; i < r; i++){
                int p = scanner.nextInt() - 1;
                int c = scanner.nextInt();

                for(int j = 0; j < n; j++){
                    if(0 <= j && j < p)
                        b[j + c] = a[j];
                    else if(p <= j && j < p + c)
                        b[j - p] = a[j];
                    else
                        b[j] = a[j];

                }

                System.arraycopy(b,0,a,0,b.length);

            }
            System.out.println(b[0]);

            n = scanner.nextInt();
            r = scanner.nextInt();
        }
    }
}

