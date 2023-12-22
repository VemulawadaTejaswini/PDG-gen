import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String answer = "";
        Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.next());
        int yo = 100;
        // int a = Integer.parseInt(s.next());
        // int b = Integer.parseInt(s.next());

        for (int i = 1;;i++){
            yo *= 1.01;
            if (yo >= x) {
                answer += i;
                break;
            }
        }
        System.out.println(answer);
    }
}