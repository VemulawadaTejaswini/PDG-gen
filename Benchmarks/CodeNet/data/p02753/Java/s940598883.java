import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;
        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] c = S.toCharArray();
        if(c[0]==c[1] && c[1]==c[2]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
