import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while (tan.hasNext()){
            int n,AC=0,WA=0,TLE=0,RE=0;
            n=tan.nextInt();
            for (int i = 0; i < n; i++) {
                String st = tan.next();
                if ("AC".equals(st))
                    AC++;
                else if ("WA".equals(st))
                    WA++;
                else if ("TLE".equals(st))
                    TLE++;
                else
                    RE++;
            }
            System.out.println("AC x "+AC);
            System.out.println("WA x "+WA);
            System.out.println("TLE x "+TLE);
            System.out.println("RE x "+RE);
        }
    }
}
