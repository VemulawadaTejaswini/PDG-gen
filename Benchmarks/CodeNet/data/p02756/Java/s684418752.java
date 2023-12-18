import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        StringBuilder before = new StringBuilder("");
        StringBuilder after = new StringBuilder("");

        int rev = 0;

        for (int i = 0; i < b; i++) {
            if (sc.nextInt() == 1) {
                rev++;
            } else {
                if (sc.nextInt() == 1) {
                    if (rev % 2 == 0){
                        after.append(sc.next());
                    } else {
                        before.insert(0, sc.next());
                    }
                } else {
                    if (rev % 2 == 0){
                        before.insert(0, sc.next());
                    } else {
                        after.append(sc.next());
                    }
                }
            }
        }

        before.insert(0, a);
        before.append(after);
        
        if (rev % 2 == 0) {
            before.reverse();
        }

        System.out.println(before);

    }

}