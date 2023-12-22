
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()){
            String alf = sc.next();
            if (alf.equals("-"))
                break;
            int m = sc.nextInt();
            for (int i = 0; i < m; i++){
                int subNum = sc.nextInt();
                String tmpSub = alf.substring(0,subNum);
                String tmp = alf.substring(subNum);
                alf = tmp + tmpSub;
            }
            System.out.println(alf);

        }
    }
}

