import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder T = new StringBuilder();
        for(int i=0;i<S.length();i++){
            T.append("x");
        }
        System.out.println(T);
}
}