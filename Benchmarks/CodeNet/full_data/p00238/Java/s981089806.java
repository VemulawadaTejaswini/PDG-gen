
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            int t = scan.nextInt();
            int n;
            int a;
            int b;

            while (t != 0) {
                n = scan.nextInt();
                int g = 0;
                for (int i = 0; i < n; i++) {
                    a = scan.nextInt();
                    b = scan.nextInt();
                    g += (b - a);

                }

                if (t <= g) {
                    System.out.println("OK");
                } else if (t > g) {
                    System.out.println(t - g);
                }
                t = scan.nextInt();
                
            }

        }

    }


