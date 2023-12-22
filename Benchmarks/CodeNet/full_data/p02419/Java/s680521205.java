import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
    private static final InputStreamReader ir = new InputStreamReader(System.in);
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] Args) throws IOException{
        final String w = sc.next().toUpperCase();
        int ans = 0;
        while(true){
            final String t = sc.next().toUpperCase();
            if(t.equals("END_OF_TEXT")) break;
            if(w.equals(t)) ans++;
        }
        System.out.println(ans);
    }
}