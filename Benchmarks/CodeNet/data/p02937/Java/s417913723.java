import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean hasChar = true;
        for(String i : t.split("")) {
            if(!(s.contains(i))) {
                hasChar = false;
            }
        }
        if(hasChar) {
            int times = 0;
            int num = s.length() - 1;
            for(String j : t.split("")) {
                if(num != s.length() - 1) {
                    if(s.substring(num + 1).contains(j)) {
                        num = s.substring(num + 1).indexOf(j) + num + 1;
                        continue;
                    }
                }
                num = s.indexOf(j);
                times++;
            }
            times--;
            System.out.println(times * s.length() + num + 1);
        }
        else {
            System.out.println("-1");
        }
    }

}
