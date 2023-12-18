import java.util.Scanner;

// これはきょーか(@ks96neko)が書いたやつ
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        int rl = r.length();

        String r0 = r.substring(0, 0);
        String a = "A";

        String rb = r.substring(2, rl);

        int c1 = rb.indexOf("C");
        int cn = rb.lastIndexOf("C");


        if (a.equals(r0)) {
            if (c1 != -1 && cn != -1) {
                if (c1 != cn) {
                    System.out.println("WA");
                } else {
                    for (int i = 1; i <= rl; i++) {
                        if (i != c1 && !Character.isLowerCase(r.charAt(i))) {
                            System.out.println("WA");
                            return;
                        }
                    }
                    System.out.println("AC");
                }

            } else {
                System.out.println("WA");
            }
        } else {
            System.out.println("WA");
        }


    }

}


