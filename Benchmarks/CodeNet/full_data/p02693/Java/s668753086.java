import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String answer = "NG";
        Scanner s = new Scanner(System.in);
        int k = Integer.parseInt(s.next());
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());

        for (int i = k; i <= b; i+=k){
            if (i >= a) {
                answer = "OK";
                break;
            }
        }
        System.out.println(answer);
    }
}