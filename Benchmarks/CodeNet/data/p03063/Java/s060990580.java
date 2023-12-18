import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("#".equals(s.charAt(i) + "")) {
                flag = !flag;
            } else if (flag) {
                count++;
            }
            // System.out.println(flag);
        }

        System.out.println(count);

    }
}