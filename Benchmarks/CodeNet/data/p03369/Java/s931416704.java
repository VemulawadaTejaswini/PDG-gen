import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.nextLine().toCharArray();

        int count = 0;
        for(char c: s) {
            if(c == 'o') {
                count++;
            }
        }
        System.out.println(700+(count*100));
        sc.close();
    }
}
