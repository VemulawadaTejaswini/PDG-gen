import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        check(S);
        System.out.println("yes");
    }
    static void check(String S){
        int [] num = new int [26];
        for(int i=0; i<S.length(); i++){
            int A = S.charAt(i)-'a';
            num[A]++;
            if(num[A]>=2){
                System.out.println("no");
                System.exit(0);
            }
        }
    }
}