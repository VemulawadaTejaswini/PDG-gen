import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("" + str.charAt(0) + (str.length()-2) + str.charAt(str.lastIndexOf(str)));
    }
}
