import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        println((int)Math.ceil(N/(D+1)));
    }

    static void println(Object o){
        System.out.println(o);
    }
    static void print(Object o){
        System.out.print(o);
    }
}
