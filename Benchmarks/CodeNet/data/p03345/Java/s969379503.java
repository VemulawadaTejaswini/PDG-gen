import java.util.Scanner;

class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        long c = Long.parseLong(s[2]);
        long k = Long.parseLong(s[3]);
        if(a == b && b == c) {
            System.out.println(0);
            return;
        }
        for(long i=0; i<k; i++) {
            long bc = b + c;
            long ca = c + a;
            long ab = a + b;
            a = bc;
            b = ca;
            c = ab;
        }
        System.out.println(a-b);
    }
}