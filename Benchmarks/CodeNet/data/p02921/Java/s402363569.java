import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=0;
        String x=in.next();
        String y=in.next();
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)==y.charAt(i))n++;
        }
        System.out.println(n);
    }
}
