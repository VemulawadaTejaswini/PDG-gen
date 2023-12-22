import java.util.*;

public class Main {
    public void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if (x != 1) {
            System.out.println(0);
        } else if (x == 1) {
            System.out.println(1);
        }
    }

}