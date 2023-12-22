import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, sum = 0;
        String line = "";
        while (true) {
            line = sc.next();
            if(line.equals("0"))break;
            sum = 0;
            for (i = 0; i < line.length(); i++) {
                sum += (line.charAt(i) - '0');
            }
            System.out.println(sum);
        }
    }
}

