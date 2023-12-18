
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
        List<String> moji = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            moji.add(scanner.next());
        }
        Collections.sort(moji);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < count ; i++) {
            sb.append(moji.get(i));
        }
        System.out.println(sb.toString());
    }
}