import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        long ans = 1l;
        long std = 1000000000000000000l;
        for (int i1 = 0; i1 < i; i1++) {
           ans *= scanner.nextLong();
           if(ans > std){
               System.out.println(-1);
                return;
           }
        }
        System.out.println(ans);
    }
}
