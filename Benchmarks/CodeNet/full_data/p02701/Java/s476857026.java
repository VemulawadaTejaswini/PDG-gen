import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            if (!arrayList.contains(temp)) {
                arrayList.add(temp);
            }
        }

        scanner.close();

        System.out.println(arrayList.size());

    }
}