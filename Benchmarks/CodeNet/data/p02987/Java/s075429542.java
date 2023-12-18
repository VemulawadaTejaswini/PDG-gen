import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        String  S;
        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] c = S.toCharArray();
        if(c[0] == c[1] && c[2] == c[3] &&c[0]!=c[2]){
            System.out.println("Yes");
        }else if(c[0] == c[2] && c[1] == c[3] &&c[0]!=c[1]){
            System.out.println("Yes");
        }else if(c[0] == c[3] && c[1] == c[2] && c[0]!=c[1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }


}

