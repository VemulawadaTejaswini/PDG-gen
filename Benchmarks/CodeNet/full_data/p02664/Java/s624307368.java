import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String T= sc.next();
        T = T.replace("?D","PD");
        T = T.replace("P?","PD");
        T = T.replace("??","PD");
        T = T.replace("?","D");
        System.out.println(T);
    }
}
