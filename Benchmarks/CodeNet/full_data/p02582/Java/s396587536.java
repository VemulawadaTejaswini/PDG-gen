import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("");

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals("R")) {
                count++;
            }
        }
            System.out.println(count);
        // }

    }
}