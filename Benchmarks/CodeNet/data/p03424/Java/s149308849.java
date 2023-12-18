import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        ArrayList<String> List = new ArrayList<String>();
        for (int a = 0; a < N; a++) {
            String moji = sc.next();
            List.add(moji);
        }
        if (List.contains("Y")== true) {
            System.out.println("four");
        }
        else {
            System.out.println("three");
        }
    }
}