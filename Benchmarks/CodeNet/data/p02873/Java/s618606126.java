
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        if (s[0] == '>') {
            list.add(0);
        }
        int t = 1;
        for (int i = 0 ; i < s.length - 1 ; i++) {
            if (s[i] == s[i + 1]) {
                t++;
            } else {
                list.add(t);
                t = 1;
            }

        }
        list.add(t);
        if (s[s.length-1] == '<') {
            list.add(0);
        }
        for (int i = 0 ; i < list.size() ; i += 2) {
            int a = list.get(i);
            int b = list.get(i + 1);
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            sum += max * (max + 1) / 2 + min * (min - 1)/2;

        }


        System.out.println(sum);
    }

}