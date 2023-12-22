import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int h = 0;
        int m = 0;
        int s = 0;
        h = n/3600;
        n = n%3600;
        m = n/60;
        s = n%60;
        System.out.println(h + ":" + m + ":"+ s);

    }
}
