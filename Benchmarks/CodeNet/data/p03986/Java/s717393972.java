import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        final String check_str = "ST";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Double d_max = Math.pow(10, 10000);
        Double d = 1d;
        int idx;
        while(d <= d_max){
            idx = s.indexOf(check_str, 1);
            if (idx >= 0) {
                //exists
                s = s.substring(0, idx) + s.substring(idx + 2);
            } else {
                //not exists
                if (s.equals(check_str)) {
                    s = "";
                }
                break;
            }
            d++;
        }
        System.out.println(s.length());
        sc.close();
    }
}
