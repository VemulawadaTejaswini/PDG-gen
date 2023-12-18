
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet<String> name = new HashSet<String>();
        for (int i = 0; i < num; i++){
            name.add(sc.next());
        }
        System.out.println(name.size());
    }
}
