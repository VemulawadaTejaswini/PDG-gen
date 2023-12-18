import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();
        String result = "";
        if (first == 0 || second == 0) {
            result = "IMPOSSIBLE";
        } else {
            result = String.valueOf((first + second) / 2);
        }
        
        System.out.println(result);
    }
 }