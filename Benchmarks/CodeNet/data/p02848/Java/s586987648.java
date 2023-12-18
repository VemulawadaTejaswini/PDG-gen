import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] SList = sc.next().split("");
        String r = "";
        for (String s:
             SList) {
            int i = alp.indexOf(s);
            i += N;
            r += alp.charAt(i%26);
        }
        System.out.println(r);
    }
}