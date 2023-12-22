import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

//        System.out.println(S);
//        System.out.println(T);

        int cnt = 0;
        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) != T.charAt(i)){
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}