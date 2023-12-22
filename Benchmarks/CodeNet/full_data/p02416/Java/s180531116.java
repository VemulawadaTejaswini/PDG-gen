import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        while (true) {
            String str = sc.nextLine();
            if("0".equals(str)){
                break;
            }
            char[] c = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                sum += c[i] - '0';
            }
            ln(sum);
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
