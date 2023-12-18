import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int startB = s.indexOf('#');
        int lastW = s.lastIndexOf('.');
        int b = 0;
        int w = 0;
        if(startB >= 0 && lastW >= 0){
            for (int i = startB; i < lastW+1; i++) {
                if(s.charAt(i) == '.') w++;
                else b++;
            }
        }
        System.out.println(Math.min(w, b));
        sc.close();
    }

}
