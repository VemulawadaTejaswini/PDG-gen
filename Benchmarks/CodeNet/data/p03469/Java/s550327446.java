import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String answer = "";
        for(int i = 0; i < line.length(); i++) {
            if(i == 3) {
                answer += '8';
            } else {
                answer += line.charAt(i);
            }
        }
        System.out.println(answer);
    }
}