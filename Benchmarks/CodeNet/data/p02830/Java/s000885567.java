import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String T = sc.next();
        String target = new String();
        for(int i = 0; i < N;i++){
            target += S.substring(i, i+1);
            target += T.substring(i, i+1);
        }
        System.out.println(target);
    }
}