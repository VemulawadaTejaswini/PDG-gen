import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String ans = N.substring(N.length() -1);
        if (ans.equals("3"))
            System.out.println("bon");
        else if(ans.equals("0") || ans.equals("1") || ans.equals("6") || ans.equals("8"))
            System.out.println("pon");
        else
            System.out.println("hon");
    }
}