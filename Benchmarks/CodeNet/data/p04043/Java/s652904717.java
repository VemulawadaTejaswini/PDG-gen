import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abc = sc.nextLine().split(" ");
        sc.close();

        int count5 = 0;
        int count7 = 0;
        for(String s: abc) {
            if(s.equals("5")) {
                count5++;
            } else if(s.equals("7")) {
                count7++;
            }
        }
        if(count5 == 2 && count7 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
