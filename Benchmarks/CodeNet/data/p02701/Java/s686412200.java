import java.util.HashSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int s = sc.nextInt();

        var set = new HashSet<String>();
        for(int i = 0; i<s; i++) {
            set.add(sc.next());
        }

        System.out.println(set.size());
    }
}