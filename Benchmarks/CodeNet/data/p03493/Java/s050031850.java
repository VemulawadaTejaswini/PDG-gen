import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int a = Integer.parseInt(line.substring(0,1));
        int b = Integer.parseInt(line.substring(1,2));
        int c = Integer.parseInt(line.substring(2,3));
        System.out.println(a+b+c);
    }
}