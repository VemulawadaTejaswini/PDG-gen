import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> al = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            al.add(i);
        }

        while (sc.hasNextLine()) {
            String S = sc.nextLine();

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if (Character.isLetter(S.charAt(i))) {
                    int index = al.indexOf(S.charAt(i)) + 22;
                    if (index >= al.size()) {
                        index %= al.size();
                    }
                    ans.append(al.get(index));
                } else {
                    ans.append(S.charAt(i));
                }
            }
            System.out.println(ans);
        }
    }
}