import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.next().split(" ", 0);
        String numStr = "";
        for (String str : strs){
            numStr += str;
        }
        int num = Integer.parseInt(numStr);
        if (num % 4 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
