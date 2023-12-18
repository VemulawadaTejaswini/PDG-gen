import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String[] array = s.split("");
        if (array[2].equals(array[3])
            && array[4].equals(array[5])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
