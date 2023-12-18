import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer Q = Integer.parseInt(scanner.next());
        String S = scanner.next();

        String[] slist = new String[Q];

        for (int i = 0; i < Q; i++) {
            Integer l = Integer.parseInt(scanner.next()), r = Integer.parseInt(scanner.next());
            String tmp = S.substring(l-1,r);
            slist[i] = tmp;
        }

        for (int i = 0; i < slist.length; i++) {
            Long fi = 0L, count = 0L;
            while(true) {
                Integer ti = slist[i].indexOf("AC", Math.toIntExact(fi));
                if(ti >= 0) {
                    fi = ti + 1L;
                } else break;
                count++;
            }
            System.out.println(count);
        }
    }
}
