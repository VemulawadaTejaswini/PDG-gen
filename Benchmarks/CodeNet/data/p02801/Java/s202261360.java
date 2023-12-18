import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = Integer.parseInt(scan.next());
        int ok = Integer.parseInt(scan.next());
        //int c = Integer.parseInt(scan.next());
//        int cnt = 0;
//        while(h>0) {
//            h = h-a;
//            cnt++;
//        }
//        if(test == ok) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
        String C = scan.next();
        System.out.println((char)(C.charAt(0)+1));
    }
}
