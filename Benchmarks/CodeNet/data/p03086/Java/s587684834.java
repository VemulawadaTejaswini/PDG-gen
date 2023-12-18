import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = sc.nextLine().split("");

        int cnt = 0;

        boolean flag = false;

        for(int i = 0 ; i < ar.length ; i++) {
            String s = ar[i];

            if(s.equals("A") || s.equals("C") ||s.equals("G") ||s.equals("T") ) {
                cnt = cnt+1;
                flag = true;
            }else {
                if(flag) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}