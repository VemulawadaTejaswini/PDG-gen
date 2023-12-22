import java.util.Scanner;

public class Main {
    public static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c += 32;
                sb.append(c);
            }
            else if(Character.isLowerCase(c)){
                c -= 32;
                sb.append(c);
            }else sb.append(c);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}

