import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m[] = new int[n], s=0,p = s,c=0;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        for (;;) {
            c++;
            p=(p+m[p])%n;
            if (s == p) {
                System.out.println(c);
                break;
            }
            if(c>n) {
                s++;
                c=1;
            }
        }
    }
}

