import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        long a = yomi.nextLong();
        long b=100;
        for(int i=1;b<a;i++){
            b+=b/100;
            if (b>=a) System.out.println(i);
        }

    }
}