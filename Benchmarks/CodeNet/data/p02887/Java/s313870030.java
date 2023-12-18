import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int out = n;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                out--;
            }
        }
        System.out.println(out);
    }
}