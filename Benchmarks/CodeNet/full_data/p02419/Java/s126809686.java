import java.io.IOException;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] Args) throws IOException{
        final String w = sc.next();
        int ans = 0;
        while(true){
            final String t = sc.next();
            if(t.equals("END_OF_TEXT")) break;
            if(w.compareToIgnoreCase(t)==0) ans++;
        }
        System.out.println(ans);
    }
}