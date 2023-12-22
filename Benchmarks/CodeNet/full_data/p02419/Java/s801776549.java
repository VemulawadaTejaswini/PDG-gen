import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String w = sc.next();
        String w2 = w.toLowerCase();
        String t = "",t2="";
        while (true) {
            t = sc.next();
            t2 = t.toLowerCase();
            if (w2.equals(t2)) count++;
            else if (t2.equals("end_of_text")) break;
        }
        System.out.println(count);
    }
}

