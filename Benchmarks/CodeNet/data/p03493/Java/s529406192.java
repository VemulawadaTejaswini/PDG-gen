import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] str = new String[3];
        int count = 0;
        str = s.split("");
        for (int i = 0; i < str.length; i++)
            if (str[i].equals("1"))
                count++;
        System.out.println(count);
    }
}