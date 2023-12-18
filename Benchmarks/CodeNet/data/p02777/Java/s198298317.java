import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S=scan.nextLine();
        String T=scan.nextLine();
        int A = scan.nextInt();
        int B = scan.nextInt();
        String U = scan.next();
        if (U.equals(S)) {
            int s = A-1;
            System.out.print(S+" "+B);
        }
        else {
            int t = B-1;
            System.out.println(A+" "+T);
        }
    }
}