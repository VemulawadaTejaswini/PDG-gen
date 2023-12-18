import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        String s2 = sb.reverse().toString();
        s2 = s2.replaceAll("resare", "");
        s2 = s2.replaceAll("esare", "");
        s2 = s2.replaceAll("maerd", "");
        s2 = s2.replaceAll("remaerd", "");



        System.out.println(s2.length() == 0 ? "YES" : "NO");
    }

}
