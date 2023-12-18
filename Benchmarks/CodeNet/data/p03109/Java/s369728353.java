import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split("/");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        if(y < 2019) {
            System.out.println("Heisei");
        }else if(y == 2019) {
            if(m < 4) {
                System.out.println("Heisei");
            }else if(m == 4) {
                if(d <= 30) {
                    System.out.println("Heisei");
                }else {
                    System.out.println("TBD");
                }
            }else {
                System.out.println("TBD");
            }
        }else {
            System.out.println("TBD");
        }
    }
}
