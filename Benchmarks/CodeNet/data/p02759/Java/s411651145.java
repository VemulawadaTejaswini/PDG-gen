import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        if (n%2==0) System.out.println(n/2);
        else System.out.println(n/2+1);
    }
}