import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int l = s.length();
        if (l==1){
            System.out.println(Integer.valueOf(s));
        }
        else if (is_9(s)){
            int n = s.charAt(0);
            System.out.println(9*(l-1)+n-48);
        }
        else {
            int n = s.charAt(0);
            System.out.println((l-1)*9+n-49);
        }
    }
    public static boolean is_9(String s){
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)!=57)
                return false;
        }
        return true;
    }
}
