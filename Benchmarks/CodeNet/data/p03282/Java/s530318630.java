import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        String ans = "1";
        long count = 0l;
        for (int i = 0; i < s.length() ; i++) {
            String ss = s.substring(i, i + 1);
            if(s.substring(i, i +1).equals("1")) {
                count++;
            }
            else if(!ss.equals("1")) {
                ans = ss;
                break;
            }
        }
        if(count >= k) System.out.println("1");
        else System.out.println(ans);
    }
}