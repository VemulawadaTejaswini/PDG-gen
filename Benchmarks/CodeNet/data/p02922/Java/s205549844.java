import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[]  input1 = s.nextLine().split(" ");
        int A = Integer.valueOf(input1[0]);
        int B = Integer.valueOf(input1[1]);

        int ct = 1;
        int hole = A;
        while(true) {
            if (hole >= B) break;
            ct++;
            hole += A-1;
        }
        System.out.println(ct);
    }
}