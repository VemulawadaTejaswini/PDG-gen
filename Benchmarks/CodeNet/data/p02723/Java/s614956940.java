import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        boolean flag = false;
        if (s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5)){
            flag = true;
        }
        if (flag==false){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
