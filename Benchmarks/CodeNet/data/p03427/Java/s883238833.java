import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int l = s.length();
        if (is_9(s)){
            System.out.println(9*l);
        }
        else {
            int n = s.charAt(0);
            System.out.println((l-1)*9+n-49);
        }
    }
    public static boolean is_9(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=57)
                return false;
        }
        return true;
    }
}
