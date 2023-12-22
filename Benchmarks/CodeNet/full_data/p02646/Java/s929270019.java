import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String[] str1 = c.nextLine().split(" ");
        String[] str2 = c.nextLine().split(" ");
        String str3 = c.nextLine();

        int position1 = Integer.parseInt(str1[0]) + (Integer.parseInt(str1[1]) * Integer.parseInt(str3));
        int position2 = Integer.parseInt(str2[0]) + (Integer.parseInt(str2[1]) * Integer.parseInt(str3));

        if (position1 >= position2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}