import java.util.*;
public class AtCoder162 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        boolean isExists = false;
        while(a > 0) {
            if(a%10 == 7) {
                isExists = true;
                break;
            }
            a = a/10;
        }
        if(isExists) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}