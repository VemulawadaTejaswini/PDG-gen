import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String n = stdIn.nextLine();
        String input = stdIn.nextLine();
        String[] a = input.split(" ");
        int c = 0;
        if(Integer.parseInt(n) == a.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (Integer.parseInt(a[i]) % Integer.parseInt(a[j]) == 0) {
                        c += 1;
                        break;
                    }
                }
            }
        }
        System.out.println(a.length - c);
    }
}
