import java.util.Scanner;
class Aca {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        if (sc.hasNextLine())
            str = sc.nextLine();
        if (str.charAt(str.length() - 1) == 's')
            str += "es";
        else
            str += 's';
        System.out.println(str);
    }
}