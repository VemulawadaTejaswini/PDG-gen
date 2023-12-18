import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        S = S.replaceAll("eraser","-");
        System.out.println(S);
        S = S.replaceAll("erase","-");
        System.out.println(S);
        S = S.replaceAll("dreamer","-");
        System.out.println(S);
        S = S.replaceAll("dream","-");
        System.out.println(S);
        S = S.replaceAll("-","");
        System.out.println(S);
        if (S.length() == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}