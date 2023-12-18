import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] cArray = s.toCharArray();
        Arrays.sort(cArray);

        if(cArray[0] == cArray[1] && cArray[2] == cArray[3] && cArray[1] != cArray[2]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
