import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer Q = Integer.parseInt(scanner.next());
        String S[] = scanner.next().split("");


        for (int i = 0; i < Q; i++) {
            Integer l = Integer.parseInt(scanner.next()), r = Integer.parseInt(scanner.next());
            Long count = 0L;
            if(S.length < l) continue;
            if(S.length < r)  r = S.length;
            for (int j = l-1; j < r-1; j++) {
                if(S[j].equals("A") && S[j+1].equals("C")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
