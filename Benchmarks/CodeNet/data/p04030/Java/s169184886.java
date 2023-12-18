import java.util.*;
public class Main {

    public static void main(String __[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while(str.contains("B")){
            System.out.println(sc.next().replaceAll("^B|[01]B",""));
        }

    }
}
