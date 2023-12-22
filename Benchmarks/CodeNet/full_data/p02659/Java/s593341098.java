import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next().replace(".", ""));
        System.out.println(a*b/100);
    }
}