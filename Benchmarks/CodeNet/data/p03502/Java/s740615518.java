import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nn = Integer.parseInt(n);
        char[] c = n.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Integer.parseInt(String.valueOf(c[i]));
        }
        if(nn % sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}