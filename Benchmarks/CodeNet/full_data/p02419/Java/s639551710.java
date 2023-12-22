import java.util.Scanner;

public class Main{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String W = scanner.next();
        String T = scanner.next();
        int count = 0;
        while (!T.equals("END_OF_TEXT")){
            if(T.equalsIgnoreCase(W))
                count++;
            T = scanner.next();
        }
        System.out.println(count);
    }
}

