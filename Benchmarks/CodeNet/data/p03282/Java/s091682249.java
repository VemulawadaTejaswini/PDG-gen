import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        long K = Integer.parseInt(scan.next());

        for(int i =0;i<100;i++){

            if(S.charAt(i) != '1'){
                System.out.println(S.charAt(i));
                return;
            }
        }

        System.out.println(1);
    }
}