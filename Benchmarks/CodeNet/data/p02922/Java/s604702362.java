import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int tap = 1;
        int count = 0;
        while(tap < b ){
            tap -= 1;
            tap += a;
            count++;
        }
        System.out.println(count);

    }

}



