import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char[] array = s.toCharArray();
        String ans = "No";
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && (array[i] == 'R' || array[i] == 'U' || array[i] == 'D')) {
                ans = "Yes";
            } else if (i % 2 == 1 && (array[i] == 'L' || array[i] == 'U' || array[i] == 'D')) {
                ans = "Yes";
            } else {
                ans = "No";
                break;
            }

        }
        System.out.println(ans);
    }
}

