import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i=0; i<num; i++) {
            char[] str = sc.next().toCharArray();
            Arrays.sort(str);
            list.add(String.valueOf(str));
        }

        int count = 0;

        for (int i=0; i<num; i++) {
            String input = list.get(i);
            for (int j=i+1; j<num; j++) {
                String target = list.get(j);
                if (isAnagram(input, target)) count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isAnagram(String input, String target) {
        return input.equals(target);
    }
}
