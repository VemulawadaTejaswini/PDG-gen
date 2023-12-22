import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String x = scan.next();
            if (!x.equals("0")) {
                int c = 1;
                System.out.println("Case " + c + ": " + x);
                c++;
            }
        }
     }
}
