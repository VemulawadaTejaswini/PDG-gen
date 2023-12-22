import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String com = sc.next();
            if ("replace".equals(com)) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                String str2 = sc.next();

                str = str.replaceAll(str.substring(a, b), str2);
            } else if ("reverse".equals(com)) {

                int a = sc.nextInt();
                int b = sc.nextInt();

                char[] c = str.toCharArray();
                char w = c[a];
                for (int j = a; j+1  <= b; j++) {
                    c[j] = c[j+1];
                }
                c[a] = w;
                str = c.toString();
            } else if ("print".equals(com)) {

                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(str.substring(a, b));
            }
            System.out.println(str);
        }
        sc.close();
    }

}