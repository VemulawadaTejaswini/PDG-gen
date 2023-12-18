import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        long a = yomi.nextLong();
        long b=100;
        for(int i=1;b<a;i++){
            b=(long)(b*0.01);
            if (a<=b) System.out.println(i);
        }

    }
}