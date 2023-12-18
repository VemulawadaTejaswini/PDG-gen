import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long div = (long)l/3;
        int amari = l %3;
        if (amari == 0) {
            System.out.println(Math.pow(div, 3));
        } else if (amari == 1) {
            System.out.println((div  + 1)* Math.pow(div, 2));
        } else if (amari == 2) {
            System.out.println(div * Math.pow((div+1), 2));
        }
    }
}