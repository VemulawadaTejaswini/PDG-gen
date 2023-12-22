import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> dic = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String input = sc.next();

            if (input.equals("insert")) {
                dic.add(sc.next());
            }

            if (input.equals("find")) {
                if (dic.contains(sc.next())) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}

