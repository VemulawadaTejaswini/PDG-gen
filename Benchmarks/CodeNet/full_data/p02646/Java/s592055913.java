import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long v = sc.nextInt();
        long b = sc.nextInt();
        long w = sc.nextInt();
        long t = sc.nextInt();

        if(v <= w) {
            System.out.println("NO");
            return;
        }

        long ret = 0;
        long ab = b -a;
        long vw = v -w;
        ret = ab / vw;
        if(ab % vw !=0){
            ret++;
        }

        if(t >= ret) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
