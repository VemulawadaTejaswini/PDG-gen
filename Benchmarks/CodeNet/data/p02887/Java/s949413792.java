import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        String result = str.replaceAll("(.)\\1+", "a");
        System.out.println(result.length());
    }
}