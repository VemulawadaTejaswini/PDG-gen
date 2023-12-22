import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        char tmp[] = line.toCharArray();
        char answer[] = new char[20];
        for(int i = 0; i < tmp.length; i++) answer[i] = tmp[tmp.length-(i+1)];
        line = String.valueOf(answer);
        System.out.println(line);
    }
}