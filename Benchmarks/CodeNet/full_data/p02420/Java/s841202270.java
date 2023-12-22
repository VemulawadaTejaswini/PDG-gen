public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            String first = sc.next();
             if (first.equals("-")) { break; }
            int m = sc.nextInt();
            int h;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i ++)  {
                sb.delete(0, first.length());
                h = sc.nextInt();
                sb.append(first.substring(h, first.length()));
                sb.append(first.substring(0, h));
                first = sb.toString();
            }
            System.out.println(first);
        }
    }
}