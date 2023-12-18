import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int len = scanner.nextInt();
        int count = scanner.nextInt();
        scanner.nextLine();
        List<String> moji = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            moji.add(scanner.nextLine());
        }
        Collections.sort(moji);
        StringBuilder sb = new StringBuilder();
        for(String s : moji) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
