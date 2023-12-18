import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int size = s.length();
        List<String> list = new ArrayList<>();
        for (int i = 1; i * 2019 <= 200000; i++) {
            list.add(String.valueOf(i*2019));
        }

        int res = 0;
        for (String m : list) {
            int count = count(m, s);
            res +=count;
        }
        System.out.println(res);
    }

    private static int count(String m, String s) {
        int res = 0;
        int size = m.length();
        for (int i = 0; i < s.length() - size +1; i++) {
            if (m.equals(s.substring(i, i + size))) {
                res++;
            }
        }
        
        return res;
    }
}