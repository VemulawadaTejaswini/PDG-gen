import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        final String check_str = "ST";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int max = 100000;
        int i = 1;
        int idx;
        while(i <= max){
            idx = s.indexOf(check_str, 0);
            if (idx != -1) {
                //exists
                s = s.replaceFirst(check_str, "");
            } else {
                break;
            }
            i++;
        }
        System.out.println(s.length());
        sc.close();
    }
}
